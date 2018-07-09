/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom;

import java.util.ArrayList;
import lk.ijse.carrental.controller.SuperController;
import lk.ijse.carrental.dto.VehicleBrandDTO;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public interface VehicleBrandController extends SuperController<VehicleBrandDTO>{
    
    public ArrayList<VehicleBrandDTO> getAllBrandName()throws Exception;
    
    public VehicleBrandDTO searchName(String brand)throws Exception;
}
