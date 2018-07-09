/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.carrental.dao.custom.AdditionalDriverDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.AdditionalDriverDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class AdditionalDriverDAOImpl implements AdditionalDriverDAO{
    
    private Connection connection;
    
    public AdditionalDriverDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(AdditionalDriverDTO dto) throws Exception {
        String SQL="Insert into additional_driver values(?,?,?,?)";
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getDriverID());
	stm.setObject(2,dto.getLicenseID());
        stm.setObject(3,dto.getName());
	stm.setObject(4,dto.getDob());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean update(AdditionalDriverDTO dto) throws Exception {
        String SQL="Update additional_driver set LicenseID =?, Name =?, DOB=? where DriverID=?";	
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getLicenseID());
	stm.setObject(2,dto.getName());
        stm.setObject(3,dto.getDob());
	stm.setObject(4,dto.getDriverID());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete from additional_driver where DriverID ='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res > 0);
    }

    @Override
    public AdditionalDriverDTO search(String key) throws Exception {
        String SQL = "Select * from additional_driver where DriverID='"+key+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        if(rst.next()){
            AdditionalDriverDTO adr = new AdditionalDriverDTO(rst.getString("DriverID"),rst.getString("LicenseID"),rst.getString("Name"),rst.getString("DOB"));
            return adr;
        }else{
            return null;        
        }       
    }

    @Override
    public ArrayList<AdditionalDriverDTO> getAll() throws Exception {
        String SQL="Select * From additional_driver";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<AdditionalDriverDTO>additionalDriverList=new ArrayList<>();
        while(rst.next()){
            AdditionalDriverDTO adr = new AdditionalDriverDTO(rst.getString("DriverID"),rst.getString("LicenseID"),rst.getString("Name"),rst.getString("DOB"));
            additionalDriverList.add(adr);
        }
        return additionalDriverList;
    }
}
