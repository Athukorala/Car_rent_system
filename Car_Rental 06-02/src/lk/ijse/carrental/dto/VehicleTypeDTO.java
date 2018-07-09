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
public class VehicleTypeDTO extends SuperDTO{
    private String vin;
    private String vehicleID;
    private String modelName;
    private String regNo;
    private int year;
    private String vehicleColor;
    private int seatCapacity;
    private String vehicleFuelType;
    private double price;
    private String vehicleStatus;

    public VehicleTypeDTO() {
    }

    public VehicleTypeDTO(String vin, String vehicleID, String modelName, String regNo, int year, String vehicleColor, int seatCapacity, String vehicleFuelType, double price, String vehicleStatus) {
        this.vin = vin;
        this.vehicleID = vehicleID;
        this.modelName = modelName;
        this.regNo = regNo;
        this.year = year;
        this.vehicleColor = vehicleColor;
        this.seatCapacity = seatCapacity;
        this.vehicleFuelType = vehicleFuelType;
        this.price = price;
        this.vehicleStatus = vehicleStatus;
        
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return the vehicleID
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * @param vehicleID the vehicleID to set
     */
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    /**
     * @return the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName the modelName to set
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return the regNo
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * @param regNo the regNo to set
     */
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the vehicleColor
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    /**
     * @param vehicleColor the vehicleColor to set
     */
    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    /**
     * @return the seatCapacity
     */
    public int getSeatCapacity() {
        return seatCapacity;
    }

    /**
     * @param seatCapacity the seatCapacity to set
     */
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    /**
     * @return the vehicleFuelType
     */
    public String getVehicleFuelType() {
        return vehicleFuelType;
    }

    /**
     * @param vehicleFuelType the vehicleFuelType to set
     */
    public void setVehicleFuelType(String vehicleFuelType) {
        this.vehicleFuelType = vehicleFuelType;
    }

    /**
     * @return the vehicleStatus
     */
    public String getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * @param vehicleStatus the vehicleStatus to set
     */
    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    

   
}
