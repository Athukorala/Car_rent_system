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
import lk.ijse.carrental.dao.custom.CustomerDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.CustomerDTO;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class CustomerDAOImpl implements CustomerDAO{
    
    private Connection connection;
    
    public CustomerDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(CustomerDTO dto) throws Exception {
        String SQL="Insert into Customer values(?,?,?,?,?,?,?,?)";
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getCID());
	stm.setObject(2,dto.getName());
        stm.setObject(3,dto.getLicenseID());
        stm.setObject(4,dto.getNic());
	stm.setObject(5,dto.getDob());
	stm.setObject(6,dto.getAddress());
        stm.setObject(7,dto.getMobile());
        stm.setObject(8,dto.getEmail());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        String SQL="Update Customer set Name=?, LicenseID=?, NIC=?, DOB=?, Address=?, Email=?, Tp=? where CID=?";
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getName());
        stm.setObject(2,dto.getLicenseID());
        stm.setObject(3,dto.getDob());
        stm.setObject(4,dto.getNic());
	stm.setObject(5,dto.getAddress());
	stm.setObject(6,dto.getEmail());
        stm.setObject(7,dto.getMobile());
        stm.setObject(8,dto.getCID());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete From Customer where CID='"+key+"'";
	Statement stm=connection.createStatement();
	int res=stm.executeUpdate(SQL);
	return (res > 0);
    }

    @Override
    public CustomerDTO search(String key) throws Exception {
        String SQL="Select * From Customer where CID='"+key+"'";	
	Statement stm=connection.createStatement();
	ResultSet rst=stm.executeQuery(SQL);
	if(rst.next()){
            CustomerDTO c1=new CustomerDTO(rst.getString("CID"),rst.getString("name"),rst.getString("licenseID"),rst.getString("nic"),rst.getString("dob"),rst.getString("address"),rst.getInt("tp"),rst.getString("email"));
            return c1;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        String SQL="Select * From Customer";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<CustomerDTO>customerList=new ArrayList<>();
        while(rst.next()){
            CustomerDTO c1=new CustomerDTO(rst.getString("CID"),rst.getString("name"),rst.getString("licenseID"),rst.getString("nic"),rst.getString("dob"),rst.getString("address"),rst.getInt("tp"),rst.getString("email"));
            customerList.add(c1);
        }
        return customerList;
    }

    @Override
    public CustomerDTO searchName(String name) throws Exception {
        String SQL = "Select * from customer where CID='"+name+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        if(rst.next()){
            CustomerDTO c1 = new CustomerDTO(rst.getString("CID"),rst.getString("name"),rst.getString("licenseID"),rst.getString("nic"),rst.getString("dob"),rst.getString("address"),rst.getInt("tp"),rst.getString("email"));
            return c1;
        }else{
            return null;        
        }
    }
}
