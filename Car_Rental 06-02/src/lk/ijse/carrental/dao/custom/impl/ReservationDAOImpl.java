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
import lk.ijse.carrental.dao.custom.ReservationDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.CustomerDTO;
import lk.ijse.carrental.dto.ReservationDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class ReservationDAOImpl implements ReservationDAO{
    
    private Connection connection;
    
    public ReservationDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ReservationDTO dto) throws Exception {
        String SQL = "Insert into reservation values(?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1,dto.getResID());
        stm.setObject(2,dto.getVtID());
        stm.setObject(3,dto.getDriverID());
        stm.setObject(4,dto.getPaymentID());
	stm.setObject(5,dto.getcID());
	stm.setObject(6,dto.getStartDate());
        stm.setObject(7,dto.getEndDate());
        stm.setObject(8,dto.getReserveDate());
        stm.setObject(9,dto.getDescription());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean update(ReservationDTO dto) throws Exception {
        String SQL = "Update reservation set VTID=?, DriverID=?, PaymentID=?, cID=?, StartDate=?, EndDate=?, ReserveDate=?, description=? where RID=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1,dto.getVtID());
        stm.setObject(2,dto.getDriverID());
        stm.setObject(3,dto.getPaymentID());
	stm.setObject(4,dto.getcID());
	stm.setObject(5,dto.getStartDate());
        stm.setObject(6,dto.getEndDate()); 
        stm.setObject(7,dto.getReserveDate());
        stm.setObject(8,dto.getDescription());
        stm.setObject(9,dto.getResID());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From reservation where RID='"+key+"'";
	Statement stm=connection.createStatement();
	int res=stm.executeUpdate(SQL);
	return (res > 0);
    }

    @Override
    public ReservationDTO search(String key) throws Exception {
        String SQL="Select * From reservation where RID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            ReservationDTO r1=new ReservationDTO(rst.getString("RID"),rst.getString("VTID"),rst.getString("DriverID"),rst.getString("PaymentID"),rst.getString("CID"),rst.getString("StartDate"),rst.getString("EndDate"),rst.getString("ReserveDate"),rst.getString("Description"));
            return r1;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<ReservationDTO> getAll() throws Exception {
        String SQL="Select * From Reservation";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<ReservationDTO>reserveList=new ArrayList<>();
        while(rst.next()){
            ReservationDTO r1=new ReservationDTO(rst.getString("RID"),rst.getString("VTID"),rst.getString("DriverID"),rst.getString("PaymentID"),rst.getString("CID"),rst.getString("StartDate"),rst.getString("EndDate"),rst.getString("ReserveDate"),rst.getString("Description"));
            reserveList.add(r1);
        }
        return reserveList;
    }    
}
