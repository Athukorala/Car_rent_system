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
public class ReservationDTO extends SuperDTO{
    private String resID;
    private String vtID;
    private String driverID;
    private String paymentID;
    private String cID;
    private String startDate;
    private String endDate;
    private String reserveDate;
    private String description;
    
    public ReservationDTO(){}

    public ReservationDTO(String resID, String vtID, String driverID, String paymentID, String cID, String startDate, String endDate, String reserveDate, String description) {
        this.resID = resID;
        this.vtID = vtID;
        this.driverID = driverID;
        this.paymentID = paymentID;
        this.cID = cID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reserveDate = reserveDate;
        this.description = description;
    }

    /**
     * @return the resID
     */
    public String getResID() {
        return resID;
    }

    /**
     * @param resID the resID to set
     */
    public void setResID(String resID) {
        this.resID = resID;
    }

    /**
     * @return the vtID
     */
    public String getVtID() {
        return vtID;
    }

    /**
     * @param vtID the vtID to set
     */
    public void setVtID(String vtID) {
        this.vtID = vtID;
    }

    /**
     * @return the driverID
     */
    public String getDriverID() {
        return driverID;
    }

    /**
     * @param driverID the driverID to set
     */
    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the cID
     */
    public String getcID() {
        return cID;
    }

    /**
     * @param cID the cID to set
     */
    public void setcID(String cID) {
        this.cID = cID;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    /**
     * @return the reserveDate
     */
    public String getReserveDate() {
        return reserveDate;
    }

    /**
     * @param reserveDate the reserveDate to set
     */
    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}