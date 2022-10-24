/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

import java.util.Date;

/**
 *
 * @author agus_
 */
public class ReporteCancelados {

    private String mesero;
    private int cantidad;
    private String descripcion;
    private String razon;
    private Date fecha;
    private String nombreSupervisor;
    private String tipoUsuario;

    /**
     * @return the mesero
     */
    public String getMesero() {
        return mesero;
    }

    /**
     * @param mesero the mesero to set
     */
    public void setMesero(String mesero) {
        this.mesero = mesero;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the razon
     */
    public String getRazon() {
        return razon;
    }

    /**
     * @param razon the razon to set
     */
    public void setRazon(String razon) {
        this.razon = razon;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nombreSupervisor
     */
    public String getNombreSupervisor() {
        return nombreSupervisor;
    }

    /**
     * @param nombreSupervisor the nombreSupervisor to set
     */
    public void setNombreSupervisor(String nombreSupervisor) {
        this.nombreSupervisor = nombreSupervisor;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
