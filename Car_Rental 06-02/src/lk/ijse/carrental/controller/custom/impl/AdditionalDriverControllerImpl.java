/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom.impl;

import lk.ijse.carrental.controller.custom.AdditionalDriverController;
import lk.ijse.carrental.dao.DAOFactory;
import lk.ijse.carrental.dao.custom.AdditionalDriverDAO;
import lk.ijse.carrental.dao.custom.CustomerDAO;
import lk.ijse.carrental.dto.AdditionalDriverDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class AdditionalDriverControllerImpl implements AdditionalDriverController{
    
    private AdditionalDriverDAO additionalDriverDAO;
    
    public AdditionalDriverControllerImpl() {
        additionalDriverDAO = (AdditionalDriverDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ADDITIONALDRIVER);
    }

    @Override
    public boolean add(AdditionalDriverDTO dto) throws Exception {
        return additionalDriverDAO.add(dto);
    }

    @Override
    public boolean update(AdditionalDriverDTO dto) throws Exception {
        return additionalDriverDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return additionalDriverDAO.delete(id);
    }

    @Override
    public AdditionalDriverDTO search(String id) throws Exception {
        return additionalDriverDAO.search(id);
    }
    
}
