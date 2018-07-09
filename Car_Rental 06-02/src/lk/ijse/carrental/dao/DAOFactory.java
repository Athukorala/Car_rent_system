/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.dao;

import lk.ijse.carrental.dao.custom.impl.AdditionalDriverDAOImpl;
import lk.ijse.carrental.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.carrental.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.carrental.dao.custom.impl.ReservationDAOImpl;
import lk.ijse.carrental.dao.custom.impl.VehicleBrandDAOImpl;
import lk.ijse.carrental.dao.custom.impl.VehicleTypeDAOImpl;

/**
 *
 * @author Nuwan Pradeep
 */
public class DAOFactory {
    public enum DAOTypes{
        CUSTOMER, ADDITIONALDRIVER, PAYMENT, RESERVATION, VEHICLEBRAND, VEHICLETYPE;
    }
    
    private DAOFactory(){}
    
    private static DAOFactory daoFactory;
    
    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType){
        switch (daoType){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ADDITIONALDRIVER:
                return new AdditionalDriverDAOImpl();
            case RESERVATION:
                return new ReservationDAOImpl();
            case VEHICLEBRAND:
                return new VehicleBrandDAOImpl();
            case VEHICLETYPE:
                return new VehicleTypeDAOImpl();
            default:
                return null;
        }
    }
}
