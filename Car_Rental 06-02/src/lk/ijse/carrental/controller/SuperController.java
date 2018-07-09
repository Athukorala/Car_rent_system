/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.controller;

import lk.ijse.carrental.dto.SuperDTO;

/**
 *
 * @author Nuwan Pradeep
 * @param <T>
 */
public interface SuperController<T extends SuperDTO> {
    public boolean add(T dto) throws Exception;
    
    public boolean update(T dto) throws Exception;
    
    public boolean delete(String id) throws Exception;
    
    public T search(String id) throws Exception;  
    
    
}
