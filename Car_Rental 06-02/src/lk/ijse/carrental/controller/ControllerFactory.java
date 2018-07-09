/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller;

import lk.ijse.carrental.controller.custom.impl.AdditionalDriverControllerImpl;
import lk.ijse.carrental.controller.custom.impl.CustomerControllerImpl;
import lk.ijse.carrental.controller.custom.impl.PaymentControllerImpl;
import lk.ijse.carrental.controller.custom.impl.ReservationControllerImpl;
import lk.ijse.carrental.controller.custom.impl.VehicleBrandControllerImpl;
import lk.ijse.carrental.controller.custom.impl.VehicleTypeControllerImpl;

/**
 *
 * @author Nuwan Pradeep
 */
public class ControllerFactory {
    public enum ControllerTypes{
        CUSTOMER, ADDITIONALDRIVER, PAYMENT, RESERVATION, VEHICLEBRAND, VEHICLETYPE;
    }
    private static ControllerFactory controllerFactory;
    
    private ControllerFactory(){}
    
    public static ControllerFactory getInstance(){
        if(controllerFactory==null){
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }
    
    public SuperController getController(ControllerTypes controller){
        switch (controller){
            case CUSTOMER:
                return new CustomerControllerImpl();
            case ADDITIONALDRIVER:
                return new AdditionalDriverControllerImpl();
            case PAYMENT:
                return new PaymentControllerImpl();
            case RESERVATION:
                return new ReservationControllerImpl();
            case VEHICLEBRAND:
                return new VehicleBrandControllerImpl();
            case VEHICLETYPE:
                return new VehicleTypeControllerImpl();
            default:
                return null;
        }
    }
}
