/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.carrental.controller.custom.VehicleTypeController;
import lk.ijse.carrental.dao.DAOFactory;
import lk.ijse.carrental.dao.custom.VehicleTypeDAO;
import lk.ijse.carrental.dto.VehicleTypeDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class VehicleTypeControllerImpl implements VehicleTypeController {
    
    private VehicleTypeDAO vehicleTypeDAO;
    
    public VehicleTypeControllerImpl(){
        vehicleTypeDAO = (VehicleTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VEHICLETYPE);
    }

    @Override
    public boolean add(VehicleTypeDTO dto) throws Exception {
        return vehicleTypeDAO.add(dto);
    }

    @Override
    public boolean update(VehicleTypeDTO dto) throws Exception {
        return vehicleTypeDAO.update(dto);
    }

    @Override
    public ArrayList<VehicleTypeDTO> getAll() throws Exception {
        return vehicleTypeDAO.getAll();
    }

    @Override
    public ArrayList<VehicleTypeDTO> searchID(String id) throws Exception {
       return vehicleTypeDAO.searchID(id);  // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehicleTypeDTO searchName(String modelName) throws Exception {
        return vehicleTypeDAO.searchName(modelName);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return vehicleTypeDAO.delete(id);
    }
    @Override
    public VehicleTypeDTO search(String id) throws Exception {
        return vehicleTypeDAO.search(id);
    }

    @Override
    public ArrayList<VehicleTypeDTO> nameGetAll(String name) throws Exception {
        return vehicleTypeDAO.nameGetAll(name);
    }
}
