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
public class InsuranceDTO extends SuperDTO{
    private String insuranceID;
    private String insuranceType;
    
    public InsuranceDTO(){}
    public InsuranceDTO(String insuranceID, String insuranceType){
        this.insuranceID = insuranceID;
        this.insuranceType = insuranceType;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
}
