/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.dao.custom;

import lk.ijse.carrental.dao.SuperDAO;
import lk.ijse.carrental.dto.VehicleBrandDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public interface VehicleBrandDAO extends SuperDAO<VehicleBrandDTO>{
    public VehicleBrandDTO searchName(String brand)throws Exception;
}
