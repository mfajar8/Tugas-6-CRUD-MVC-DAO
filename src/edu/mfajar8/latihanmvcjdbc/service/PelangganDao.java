/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mfajar8.latihanmvcjdbc.service;

import edu.mfajar8.latihanmvcjdbc.entity.Pelanggan;
import edu.mfajar8.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author LENOVO
 * Mochamad Fajar Ismatulloh
 * PBO-11/10116463
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan () throws PelangganException;
    
}
