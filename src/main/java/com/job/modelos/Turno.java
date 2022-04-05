/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

import com.job.utilidades.Utilidades;
import java.util.Date;

/**
 *
 * @author agus_
 */
public class Turno {

    private String idTurno;
    private Date fechaApertura;
    private Date fechaCierre;
    private float fondoInicial;
    private int turno;//folio turno
    private String idUsuario;
    private String estatus;// abierto,cerrado 
    private float efectivoDeclarado;
    private String complemento = "";

    /**
     * @return the idTurno
     */
    public String getIdTurno() {
        return idTurno;
    }

    /**
     * @param idTurno the idTurno to set
     */
    public void setIdTurno(String idTurno) {
        this.idTurno = idTurno;
    }

    /**
     * @return the fechaApertura
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the fechaCierre
     */
    public Date getFechaCierre() {
        return fechaCierre;
    }

    /**
     * @param fechaCierre the fechaCierre to set
     */
    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    /**
     * @return the fondoInicial
     */
    public float getFondoInicial() {
        return fondoInicial;
    }

    /**
     * @param fondoInicial the fondoInicial to set
     */
    public void setFondoInicial(float fondoInicial) {
        this.fondoInicial = fondoInicial;
    }

    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
     * @return the efectivoDeclarado
     */
    public float getEfectivoDeclarado() {
        return efectivoDeclarado;
    }

    /**
     * @param efectivoDeclarado the efectivoDeclarado to set
     */
    public void setEfectivoDeclarado(float efectivoDeclarado) {
        this.efectivoDeclarado = efectivoDeclarado;
    }

    public void setComplementoToString(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        if (getFechaCierre() == null) {
            return complemento;
        }
        return Utilidades.getFechaStringCompleto(getFechaApertura()) + " - " + Utilidades.getFechaStringCompleto(getFechaCierre());
    }

}
