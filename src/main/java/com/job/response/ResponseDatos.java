/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.response;

import java.util.List;

/**
 *
 * @author agus_
 */
public class ResponseDatos<T> {
    private List<T> datos;
    private String mensaje;
    private Boolean realizado;

    /**
     * @return the datos
     */
    public List<T> getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(List<T> datos) {
        this.datos = datos;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the realizado
     */
    public Boolean getRealizado() {
        return realizado;
    }

    /**
     * @param realizado the realizado to set
     */
    public void setRealizado(Boolean realizado) {
        this.realizado = realizado;
    }
}
