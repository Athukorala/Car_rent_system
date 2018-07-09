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
import lk.ijse.carrental.dao.custom.VehicleTypeDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class VehicleTypeDAOImpl implements VehicleTypeDAO{
    
    private Connection connection;
    
    public VehicleTypeDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(VehicleTypeDTO dto) throws Exception {
        String SQL="Insert into Vehicle_Type values(?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement stm=connection.prepareStatement(SQL);
	stm.setObject(1,dto.getVin());
        stm.setObject(2,dto.getVehicleID());
        stm.setObject(3,dto.getModelName());
	stm.setObject(4,dto.getRegNo());
	stm.setObject(5,dto.getYear());
	stm.setObject(6,dto.getVehicleColor());
	stm.setObject(7,dto.getSeatCapacity());
	stm.setObject(8,dto.getVehicleFuelType());
        stm.setObject(9,dto.getPrice());
        stm.setObject(10,dto.getVehicleStatus());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean update(VehicleTypeDTO dto) throws Exception {
        String SQL="Update Vehicle_Type set ModelName=?, RegNo=?, year=?, Colour=?, SeatingCapacity=?, FuelType=?, price=?, Status=? where VIN=?";	
	PreparedStatement stm=connection.prepareStatement(SQL);
	
        stm.setObject(1,dto.getVehicleID());
        stm.setObject(2,dto.getModelName());
	stm.setObject(3,dto.getRegNo());
	stm.setObject(4,dto.getYear());
	stm.setObject(5,dto.getVehicleColor());
	stm.setObject(6,dto.getSeatCapacity());
	stm.setObject(7,dto.getVehicleFuelType());
        stm.setObject(8,dto.getPrice());
        stm.setObject(9,dto.getVehicleStatus());
        stm.setObject(10,dto.getVin());
	int res=stm.executeUpdate();
	return (res > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="Delete from Vehicle_Type where VIN='"+key+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return (res > 0);
    }

    @Override
    public VehicleTypeDTO search(String key) throws Exception {
        String SQL = "Select * from Vehicle_Type where VBID='"+key+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        if(rst.next()){
            VehicleTypeDTO v1 = new VehicleTypeDTO(rst.getString("VTID"),rst.getString("VBID"),rst.getString("ModelName"),rst.getString("RegNo"),rst.getInt("year"),rst.getString("Colour"),rst.getInt("SeatingCapacity"),rst.getString("FuelType"),rst.getDouble("price"),rst.getString("Status"));
            return v1;
        }else{
            return null;        
        }
    }

    @Override
    public ArrayList<VehicleTypeDTO> getAll() throws Exception {
        String SQL="Select * From Vehicle_Type";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<VehicleTypeDTO>vehicleTypeList=new ArrayList<>();
        while(rst.next()){
            VehicleTypeDTO v1 = new VehicleTypeDTO(rst.getString("VTID"),rst.getString("VBID"),rst.getString("ModelName"),rst.getString("RegNo"),rst.getInt("year"),rst.getString("Colour"),rst.getInt("SeatingCapacity"),rst.getString("FuelType"),rst.getDouble("price"),rst.getString("Status"));
            vehicleTypeList.add(v1);
        }
        return vehicleTypeList;
    }

    @Override
    public ArrayList<VehicleTypeDTO> searchID(String id) throws Exception {
        String SQL = "Select * from Vehicle_Type where VBID='"+id+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        ArrayList<VehicleTypeDTO>typeDTOs=new ArrayList<>();
        while(rst.next()){
            VehicleTypeDTO v1 = new VehicleTypeDTO(rst.getString("VTID"),rst.getString("VBID"),rst.getString("ModelName"),rst.getString("RegNo"),rst.getInt("year"),rst.getString("Colour"),rst.getInt("SeatingCapacity"),rst.getString("FuelType"),rst.getDouble("price"),rst.getString("Status"));
            typeDTOs.add(v1);
        }
            return typeDTOs;  //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehicleTypeDTO searchName(String modelName) throws Exception {
        String SQL = "Select * from Vehicle_Type where ModelName='"+modelName+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        if(rst.next()){
            VehicleTypeDTO v1 = new VehicleTypeDTO(rst.getString("VTID"),rst.getString("VBID"),rst.getString("ModelName"),rst.getString("RegNo"),rst.getInt("year"),rst.getString("Colour"),rst.getInt("SeatingCapacity"),rst.getString("FuelType"),rst.getDouble("price"),rst.getString("Status"));
            return v1;
        }else{
            return null;        
        }
    }

    @Override
    public ArrayList<VehicleTypeDTO> nameGetAll(String name) throws Exception {
        String SQL = "Select * from Vehicle_Type where VBID='"+name+"'";
        Statement stm= connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        ArrayList<VehicleTypeDTO>typeList=new ArrayList<>();
        while(rst.next()){
            VehicleTypeDTO v1 = new VehicleTypeDTO(rst.getString("VTID"),rst.getString("VBID"),rst.getString("ModelName"),rst.getString("RegNo"),rst.getInt("year"),rst.getString("Colour"),rst.getInt("SeatingCapacity"),rst.getString("FuelType"),rst.getDouble("price"),rst.getString("Status"));
            typeList.add(v1);
        }
            return typeList;  
    }
}
