/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.carrental.controller.custom.CustomerController;
import lk.ijse.carrental.dao.DAOFactory;
import lk.ijse.carrental.dao.custom.CustomerDAO;
import lk.ijse.carrental.dto.CustomerDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class CustomerControllerImpl implements CustomerController{
    
    private CustomerDAO customerDAO;

    public CustomerControllerImpl() {
        customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    }

    @Override
    public boolean add(CustomerDTO dto) throws Exception {
        return customerDAO.add(dto);
    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        return customerDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return customerDAO.delete(id);
    }

    @Override
    public CustomerDTO search(String id) throws Exception {
        return customerDAO.search(id);
    }

    @Override
    public ArrayList<CustomerDTO> getAllIDs() throws Exception{
        return customerDAO.getAll();
    }

    @Override
    public CustomerDTO searchName(String name) throws Exception {
        return customerDAO.searchName(name);
    }
    
}
