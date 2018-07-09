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
import lk.ijse.carrental.dao.custom.VehicleBrandDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.VehicleBrandDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class VehicleBrandDAOImpl implements VehicleBrandDAO{
    
    private Connection connection;
    
    public VehicleBrandDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(VehicleBrandDTO dto) throws Exception {
        String SQL="Insert into Vehicle_Brand values(?,?)";
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getVehicleID());
	stm.setObject(2,dto.getVehicleBrandName());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean update(VehicleBrandDTO dto) throws Exception {
        String SQL="Update Vehicle_Brand set NameInsID=? where VehicleID=?";
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getVehicleBrandName());
        stm.setObject(2,dto.getVehicleID());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete from Vehicle_Brand where VehicleID='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res > 0);
    }

    @Override
    public VehicleBrandDTO search(String name) throws Exception {
        String SQL = "Select * from Vehicle_Brand where VehicleBrandName='"+name+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        if(rst.next()){
            VehicleBrandDTO vb = new VehicleBrandDTO(rst.getString("VBID"),rst.getString("VehicleBrandName"));
            return vb;
        }else{
            return null;        
        }    
    }

    @Override
    public ArrayList<VehicleBrandDTO> getAll() throws Exception {
        String SQL="Select * From Vehicle_Brand";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<VehicleBrandDTO>vehicleBrandList=new ArrayList<>();
        while(rst.next()){
            VehicleBrandDTO vb = new VehicleBrandDTO(rst.getString("VBID"),rst.getString("VehicleBrandName"));
            vehicleBrandList.add(vb);
        }
        return vehicleBrandList;
    }

    @Override
    public VehicleBrandDTO searchName(String brand) throws Exception {
        String SQL = "Select * from Vehicle_Brand where VBID='"+brand+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        if(rst.next()){
            VehicleBrandDTO vb = new VehicleBrandDTO(rst.getString("VBID"),rst.getString("VehicleBrandName"));
            return vb;
        }else{
            return null;        
        }
    }
}