/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

/**
 *
 * @author agus_
 */
public class Mesa {
        private String id;
    private String mesa;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the mesa
     */
    public String getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
    
    @Override
    public String toString(){
    return getMesa();
    }
}
