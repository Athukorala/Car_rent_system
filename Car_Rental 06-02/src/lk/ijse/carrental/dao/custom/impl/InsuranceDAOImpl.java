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
import lk.ijse.carrental.dao.custom.InsuranceDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.InsuranceDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class InsuranceDAOImpl implements InsuranceDAO{
    
    private Connection connection;
    
    public InsuranceDAOImpl(){
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(InsuranceDTO dto) throws Exception {
        String SQL = "INSER INTO insurance values (?, ?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getInsuranceID());
        stm.setObject(2, dto.getInsuranceType());
        int res = stm.executeUpdate();
        return (res > 0);
    }

    @Override
    public boolean update(InsuranceDTO dto) throws Exception {
        String SQL = "UPDATE insurance SET InsuranceType=? where InsID=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getInsuranceType());
        stm.setObject(2, dto.getInsuranceID());
        int res = stm.executeUpdate();
        return (res > 0);}

    @Override
    public boolean delete(String key) throws Exception {
        String SQL="delete from insurance where InsID'"+key+"'";
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return (res > 0);
    }

    @Override
    public InsuranceDTO search(String key) throws Exception {
        String SQL = "select * from insurancewhere InsID='"+key+"'";
        Statement stm = connection.createStatement();
        ResultSet rst=stm.executeQuery((SQL));
        if(rst.next()){
            InsuranceDTO i1=new InsuranceDTO(rst.getString("InsID"),rst.getString("InsuranceType"));
            return i1;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<InsuranceDTO> getAll() throws Exception {
        String SQL = "select * from insurance";
        Statement stm = connection.createStatement();
        ResultSet rst= stm.executeQuery(SQL);
        ArrayList<InsuranceDTO>insuranceList = new ArrayList<>();
        while(rst.next()){
            InsuranceDTO i1=new InsuranceDTO(rst.getString("InsID"),rst.getString("InsuranceType"));
            insuranceList.add(i1);
        }
        return insuranceList;
    }
}
