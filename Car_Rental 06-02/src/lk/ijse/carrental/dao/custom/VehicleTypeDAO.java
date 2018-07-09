/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.dao.custom;

import java.util.ArrayList;
import lk.ijse.carrental.dao.SuperDAO;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public interface VehicleTypeDAO extends SuperDAO<VehicleTypeDTO>{
    public ArrayList<VehicleTypeDTO> searchID(String id) throws Exception;
    
    public VehicleTypeDTO searchName(String modelName)throws Exception;
    
    public ArrayList<VehicleTypeDTO> nameGetAll(String name) throws Exception;
}
