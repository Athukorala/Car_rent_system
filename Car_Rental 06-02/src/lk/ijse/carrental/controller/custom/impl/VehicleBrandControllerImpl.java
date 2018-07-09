/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.carrental.controller.custom.VehicleBrandController;
import lk.ijse.carrental.dao.DAOFactory;
import lk.ijse.carrental.dao.custom.VehicleBrandDAO;
import lk.ijse.carrental.dao.custom.VehicleTypeDAO;
import lk.ijse.carrental.dao.db.ConnectionFactory;
import lk.ijse.carrental.dto.VehicleBrandDTO;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class VehicleBrandControllerImpl implements VehicleBrandController{
    
    private VehicleBrandDAO vehicleBrandDAO;
    private Connection con;
    
    public VehicleBrandControllerImpl(){
        vehicleBrandDAO = (VehicleBrandDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VEHICLEBRAND);
        
    }
    

    @Override 
    public ArrayList<VehicleBrandDTO> getAllBrandName() throws Exception {
       return vehicleBrandDAO.getAll();
    }

    @Override
    public boolean add(VehicleBrandDTO dto) throws Exception {
        return vehicleBrandDAO.add(dto);
    }

    @Override
    public boolean update(VehicleBrandDTO dto) throws Exception {
        return vehicleBrandDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return vehicleBrandDAO.delete(id);
    }

    @Override
    public VehicleBrandDTO search(String id) throws Exception {
       return vehicleBrandDAO.search(id);
    }

    @Override
    public VehicleBrandDTO searchName(String brand) throws Exception {
        return vehicleBrandDAO.searchName(brand);
    }
}