/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom;

import java.util.ArrayList;
import lk.ijse.carrental.controller.SuperController;
import lk.ijse.carrental.dto.CustomerDTO;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public interface CustomerController extends SuperController<CustomerDTO>{

    public ArrayList<CustomerDTO> getAllIDs()throws Exception;
    
    
    public CustomerDTO searchName(String name)throws Exception; 
}
