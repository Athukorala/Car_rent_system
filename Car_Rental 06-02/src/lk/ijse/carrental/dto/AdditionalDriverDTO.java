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
public class AdditionalDriverDTO extends SuperDTO{
    private String driverID;
    private String licenseID;
    private String name;
    private String dob;
    
    public AdditionalDriverDTO(){}
    public AdditionalDriverDTO(String driverID, String licenseID, String name, String dob){
        this.driverID = driverID;
        this.licenseID = name;
        this.name = name;
        this.dob = dob;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
