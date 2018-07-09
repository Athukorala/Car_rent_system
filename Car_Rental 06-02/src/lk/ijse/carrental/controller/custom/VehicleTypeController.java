/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom;

import java.util.ArrayList;
import static javafx.scene.input.KeyCode.T;
import lk.ijse.carrental.controller.SuperController;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public interface VehicleTypeController extends SuperController<VehicleTypeDTO>{
    
    public ArrayList<VehicleTypeDTO> getAll() throws Exception;
    public ArrayList<VehicleTypeDTO> searchID(String id) throws Exception;
    public VehicleTypeDTO searchName(String modelName)throws Exception; 
    public ArrayList<VehicleTypeDTO> nameGetAll(String name) throws Exception;
}
