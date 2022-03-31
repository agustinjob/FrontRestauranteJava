/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

/**
 *
 * @author agus_
 */
public class ProductoCuenta {
     private String id;
    private String nombre;
    private int cantidad; 
    private float costo;
    private float importe;
    private String estatus;// Cancenlado,Cobrado, Parcial
    private String motivoCancelacion;
    private int cantidadCancelado;
    private String catEspecifica;
    private String catGeneral;

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
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * @return the importe
     */
    public float getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(float importe) {
        this.importe = importe;
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

    /**
     * @return the motivoCancelacion
     */
    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    /**
     * @param motivoCancelacion the motivoCancelacion to set
     */
    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    /**
     * @return the cantidadCancelado
     */
    public int getCantidadCancelado() {
        return cantidadCancelado;
    }

    /**
     * @param cantidadCancelado the cantidadCancelado to set
     */
    public void setCantidadCancelado(int cantidadCancelado) {
        this.cantidadCancelado = cantidadCancelado;
    }

    /**
     * @return the catEspecifica
     */
    public String getCatEspecifica() {
        return catEspecifica;
    }

    /**
     * @param catEspecifica the catEspecifica to set
     */
    public void setCatEspecifica(String catEspecifica) {
        this.catEspecifica = catEspecifica;
    }

    /**
     * @return the catGeneral
     */
    public String getCatGeneral() {
        return catGeneral;
    }

    /**
     * @param catGeneral the catGeneral to set
     */
    public void setCatGeneral(String catGeneral) {
        this.catGeneral = catGeneral;
    }
}
