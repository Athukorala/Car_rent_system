/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.dto;

/**
 *
 * @author Nuwan Pradeep
 */
public class VehicleBrandDTO extends SuperDTO{
    private String vehicleID;
    private String vehicleBrandName;
    
    public VehicleBrandDTO(){}
    public VehicleBrandDTO(String vehicleID, String VehicleBrandName){
        this.vehicleID = vehicleID;
        this.vehicleBrandName = VehicleBrandName;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleBrandName() {
        return vehicleBrandName;
    }

    public void setVehicleBrandName(String vehicleBrandName) {
        this.vehicleBrandName = vehicleBrandName;
    }
    
    
}
