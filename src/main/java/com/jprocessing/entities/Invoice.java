/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jprocessing.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author rumatoest
 */
@Entity
@Table(name = "jp_invoices")
public class Invoice implements JpEntity<Long> {

    @Override
    public Long getPk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPk(Long primaryKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
