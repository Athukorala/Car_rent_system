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
public class OfferDetailsDTO extends SuperDTO{
    private String offerID;
    private String description;
    private String status;
    
    public OfferDetailsDTO(){}
    public OfferDetailsDTO(String offerID, String description, String status){
        this.offerID = offerID;
        this.description = description;
        this.status = status;
    }

    public String getOfferID() {
        return offerID;
    }

    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
