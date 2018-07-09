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
public class CustomerDTO extends SuperDTO{
    private String CID;
    private String name;
    private String licenseID;
    private String nic;
    private String dob;
    private String address;
    private int mobile;
    private String email;
    
    
            
    public CustomerDTO(){}
    public CustomerDTO(String CID, String name, String licenseID,String nic, String dob, String address, int mobile, String email){
        this.CID = CID;
        this.name = name;
        this.licenseID = licenseID;
        this.nic=nic;
        this.dob = dob;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }
    
}
