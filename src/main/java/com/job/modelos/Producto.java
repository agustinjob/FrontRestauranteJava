/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

/**
 *
 * @author agus_
 */
public class Producto {
     private String id;
    private String nombre;
    private String categoriaGeneral;
    private String categoriaEspecifica;
    private double precio;
    private String estatus;//eliminado, vigente

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the categoriaGeneral
     */
    public String getCategoriaGeneral() {
        return categoriaGeneral;
    }

    /**
     * @param categoriaGeneral the categoriaGeneral to set
     */
    public void setCategoriaGeneral(String categoriaGeneral) {
        this.categoriaGeneral = categoriaGeneral;
    }

    /**
     * @return the categoriaEspecifica
     */
    public String getCategoriaEspecifica() {
        return categoriaEspecifica;
    }

    /**
     * @param categoriaEspecifica the categoriaEspecifica to set
     */
    public void setCategoriaEspecifica(String categoriaEspecifica) {
        this.categoriaEspecifica = categoriaEspecifica;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
