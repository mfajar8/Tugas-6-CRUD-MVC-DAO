/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mfajar8.latihanmvcjdbc.event;

import edu.mfajar8.latihanmvcjdbc.entity.Pelanggan;
import edu.mfajar8.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author LENOVO
 * Mochamad Fajar Ismatulloh
 * PBO-11/10116463
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
    
    
}
