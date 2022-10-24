/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

/**
 *
 * @author agus_
 */
public class ReporteCategoria {
    
     private int cantidadTotal;
    private double importeTotal;
    private String categoria;

    /**
     * @return the cantidadTotal
     */
    public int getCantidadTotal() {
        return cantidadTotal;
    }

    /**
     * @param cantidadTotal the cantidadTotal to set
     */
    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    /**
     * @return the importeTotal
     */
    public double getImporteTotal() {
        return importeTotal;
    }

    /**
     * @param importeTotal the importeTotal to set
     */
    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
