/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom.impl;

import lk.ijse.carrental.controller.custom.ReservationController;
import lk.ijse.carrental.dao.DAOFactory;
import lk.ijse.carrental.dao.custom.ReservationDAO;
import lk.ijse.carrental.dto.ReservationDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class ReservationControllerImpl implements ReservationController{
    
    private ReservationDAO reservationDAO;
    
    public ReservationControllerImpl(){
        reservationDAO = (ReservationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RESERVATION);
    }

    @Override
    public boolean add(ReservationDTO dto) throws Exception {
        return reservationDAO.add(dto);
    }

    @Override
    public boolean update(ReservationDTO dto) throws Exception {
        return reservationDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return reservationDAO.delete(id);
    }

    @Override
    public ReservationDTO search(String id) throws Exception {
        return reservationDAO.search(id);
    }
}
