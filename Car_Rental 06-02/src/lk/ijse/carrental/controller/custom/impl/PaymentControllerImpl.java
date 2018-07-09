/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom.impl;

import lk.ijse.carrental.controller.custom.PaymentController;
import lk.ijse.carrental.dao.DAOFactory;
import lk.ijse.carrental.dao.custom.PaymentDAO;
import lk.ijse.carrental.dto.PaymentDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class PaymentControllerImpl implements PaymentController{
    
    private PaymentDAO paymentDAO;
    
    public PaymentControllerImpl(){
        paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    }

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
        return paymentDAO.add(dto);
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        return paymentDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return paymentDAO.delete(id);
    }

    @Override
    public PaymentDTO search(String id) throws Exception {
        return paymentDAO.search(id);
    }
}
