/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author agus_
 */
public class Cuenta {
   private String idCuenta;
    private String idTurno;
    private String nombreCuenta;
    private Date apertura;
    private Date cierre;
    private String idMesero;
    private String nombreMesero;
    private String mesa;
    private String cambio;
    private float montoTotal;
    private float montoSubtotal;
    private float iva;
    private float descuento=0; // ´porcentaje
    private float montoTotalDescuento=0;//el descuento que fue
    private String comentarioDescuento;
    private int personas;
    private int orden;
    private int folio;
    private List<ProductoCuenta> productos;
    private String estatus;//Abierta,Cerrada,Pendiente, traspasada
    private Boolean impreso;
    private float pagoEfectivo;
    private float pagoVisa;
    private float pagoMasterCard;
    private float pagoAmericanExpress;
    private float cantidadPago; // Con que billete pago si es que no dio exacto
    private float propinaEfectivo;
    private float propinaVisa;
    private float propinaMasterCard;
    private float propinaAmericanExpress;
    private boolean propinaPagada;
    private boolean huboDescuento;
    private String observaciones;
    private boolean esModificable=true; 
    private boolean sePago=false; 

    /**
     * @return the idCuenta
     */
    public String getIdCuenta() {
        return idCuenta;
    }

    /**
     * @param idCuenta the idCuenta to set
     */
    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

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
     * @return the nombreCuenta
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * @param nombreCuenta the nombreCuenta to set
     */
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    /**
     * @return the apertura
     */
    public Date getApertura() {
        return apertura;
    }

    /**
     * @param apertura the apertura to set
     */
    public void setApertura(Date apertura) {
        this.apertura = apertura;
    }

    /**
     * @return the cierre
     */
    public Date getCierre() {
        return cierre;
    }

    /**
     * @param cierre the cierre to set
     */
    public void setCierre(Date cierre) {
        this.cierre = cierre;
    }

    /**
     * @return the idMesero
     */
    public String getIdMesero() {
        return idMesero;
    }

    /**
     * @param idMesero the idMesero to set
     */
    public void setIdMesero(String idMesero) {
        this.idMesero = idMesero;
    }

    /**
     * @return the nombreMesero
     */
    public String getNombreMesero() {
        return nombreMesero;
    }

    /**
     * @param nombreMesero the nombreMesero to set
     */
    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
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

    /**
     * @return the cambio
     */
    public String getCambio() {
        return cambio;
    }

    /**
     * @param cambio the cambio to set
     */
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    /**
     * @return the montoTotal
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the montoSubtotal
     */
    public float getMontoSubtotal() {
        return montoSubtotal;
    }

    /**
     * @param montoSubtotal the montoSubtotal to set
     */
    public void setMontoSubtotal(float montoSubtotal) {
        this.montoSubtotal = montoSubtotal;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
    }

    /**
     * @return the descuento
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the montoTotalDescuento
     */
    public float getMontoTotalDescuento() {
        return montoTotalDescuento;
    }

    /**
     * @param montoTotalDescuento the montoTotalDescuento to set
     */
    public void setMontoTotalDescuento(float montoTotalDescuento) {
        this.montoTotalDescuento = montoTotalDescuento;
    }

    /**
     * @return the comentarioDescuento
     */
    public String getComentarioDescuento() {
        return comentarioDescuento;
    }

    /**
     * @param comentarioDescuento the comentarioDescuento to set
     */
    public void setComentarioDescuento(String comentarioDescuento) {
        this.comentarioDescuento = comentarioDescuento;
    }

    /**
     * @return the personas
     */
    public int getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(int personas) {
        this.personas = personas;
    }

    /**
     * @return the orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the productos
     */
    public List<ProductoCuenta> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<ProductoCuenta> productos) {
        this.productos = productos;
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
     * @return the impreso
     */
    public Boolean getImpreso() {
        return impreso;
    }

    /**
     * @param impreso the impreso to set
     */
    public void setImpreso(Boolean impreso) {
        this.impreso = impreso;
    }

    /**
     * @return the pagoEfectivo
     */
    public float getPagoEfectivo() {
        return pagoEfectivo;
    }

    /**
     * @param pagoEfectivo the pagoEfectivo to set
     */
    public void setPagoEfectivo(float pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    /**
     * @return the pagoVisa
     */
    public float getPagoVisa() {
        return pagoVisa;
    }

    /**
     * @param pagoVisa the pagoVisa to set
     */
    public void setPagoVisa(float pagoVisa) {
        this.pagoVisa = pagoVisa;
    }

    /**
     * @return the pagoMasterCard
     */
    public float getPagoMasterCard() {
        return pagoMasterCard;
    }

    /**
     * @param pagoMasterCard the pagoMasterCard to set
     */
    public void setPagoMasterCard(float pagoMasterCard) {
        this.pagoMasterCard = pagoMasterCard;
    }

    /**
     * @return the pagoAmericanExpress
     */
    public float getPagoAmericanExpress() {
        return pagoAmericanExpress;
    }

    /**
     * @param pagoAmericanExpress the pagoAmericanExpress to set
     */
    public void setPagoAmericanExpress(float pagoAmericanExpress) {
        this.pagoAmericanExpress = pagoAmericanExpress;
    }

    /**
     * @return the cantidadPago
     */
    public float getCantidadPago() {
        return cantidadPago;
    }

    /**
     * @param cantidadPago the cantidadPago to set
     */
    public void setCantidadPago(float cantidadPago) {
        this.cantidadPago = cantidadPago;
    }

    /**
     * @return the propinaEfectivo
     */
    public float getPropinaEfectivo() {
        return propinaEfectivo;
    }

    /**
     * @param propinaEfectivo the propinaEfectivo to set
     */
    public void setPropinaEfectivo(float propinaEfectivo) {
        this.propinaEfectivo = propinaEfectivo;
    }

    /**
     * @return the propinaVisa
     */
    public float getPropinaVisa() {
        return propinaVisa;
    }

    /**
     * @param propinaVisa the propinaVisa to set
     */
    public void setPropinaVisa(float propinaVisa) {
        this.propinaVisa = propinaVisa;
    }

    /**
     * @return the propinaMasterCard
     */
    public float getPropinaMasterCard() {
        return propinaMasterCard;
    }

    /**
     * @param propinaMasterCard the propinaMasterCard to set
     */
    public void setPropinaMasterCard(float propinaMasterCard) {
        this.propinaMasterCard = propinaMasterCard;
    }

    /**
     * @return the propinaAmericanExpress
     */
    public float getPropinaAmericanExpress() {
        return propinaAmericanExpress;
    }

    /**
     * @param propinaAmericanExpress the propinaAmericanExpress to set
     */
    public void setPropinaAmericanExpress(float propinaAmericanExpress) {
        this.propinaAmericanExpress = propinaAmericanExpress;
    }

    /**
     * @return the propinaPagada
     */
    public boolean isPropinaPagada() {
        return propinaPagada;
    }

    /**
     * @param propinaPagada the propinaPagada to set
     */
    public void setPropinaPagada(boolean propinaPagada) {
        this.propinaPagada = propinaPagada;
    }

    /**
     * @return the huboDescuento
     */
    public boolean isHuboDescuento() {
        return huboDescuento;
    }

    /**
     * @param huboDescuento the huboDescuento to set
     */
    public void setHuboDescuento(boolean huboDescuento) {
        this.huboDescuento = huboDescuento;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the esModificable
     */
    public boolean isEsModificable() {
        return esModificable;
    }

    /**
     * @param esModificable the esModificable to set
     */
    public void setEsModificable(boolean esModificable) {
        this.esModificable = esModificable;
    }

    /**
     * @return the sePago
     */
    public boolean isSePago() {
        return sePago;
    }

    /**
     * @param sePago the sePago to set
     */
    public void setSePago(boolean sePago) {
        this.sePago = sePago;
    }
}
