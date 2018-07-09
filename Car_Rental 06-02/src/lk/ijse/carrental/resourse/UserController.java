/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.resourse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.carrental.dao.db.ConnectionFactory;


public class UserController {
    
    public static int addUser(User user) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO User VALUES(?, password(?))";
        PreparedStatement stm = ConnectionFactory.getInstance().getConnection().prepareStatement(query);
        stm.setObject(1, user.getUsername());
        stm.setObject(2, user.getPassword());
        return stm.executeUpdate();
    }
    
    public static boolean login(User user) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM User WHERE username = ? AND password = ?";
        PreparedStatement stm = ConnectionFactory.getInstance().getConnection().prepareStatement(query);
        stm.setObject(1, user.getUsername());
        stm.setObject(2, user.getPassword());
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
}
