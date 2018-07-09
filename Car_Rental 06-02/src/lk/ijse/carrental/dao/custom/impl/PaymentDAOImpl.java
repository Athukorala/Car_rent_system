/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.dao.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.carrental.dao.custom.PaymentDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.PaymentDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class PaymentDAOImpl implements PaymentDAO{
    
    private Connection con;
    
    public PaymentDAOImpl(){
        con = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
