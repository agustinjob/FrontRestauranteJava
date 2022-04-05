/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.modelos;

/**
 *
 * @author agus_
 */
public class VentasResponse {
 private float bebidas=0.0f;
    private float porcentajeBebidas=0.0f;
    private float alimentos=0.0f;
    private float porcentajeAlimentos=0.0f;
    private float otros=0.0f;
    private float procentajeOtros=0.0f;
    private float ventaTotal=0.0f;
    private float impuestos=0.0f;
    private float descuentos=0.0f;

    private int cuentasAbiertas=0;
    private int cuentasImpresas=0;
    private int cuentasCerradas=0;
    private int cuentasPendientes;   

    /**
     * @return the bebidas
     */
    public float getBebidas() {
        return bebidas;
    }

    /**
     * @param bebidas the bebidas to set
     */
    public void setBebidas(float bebidas) {
        this.bebidas = bebidas;
    }

    /**
     * @return the porcentajeBebidas
     */
    public float getPorcentajeBebidas() {
        return porcentajeBebidas;
    }

    /**
     * @param porcentajeBebidas the porcentajeBebidas to set
     */
    public void setPorcentajeBebidas(float porcentajeBebidas) {
        this.porcentajeBebidas = porcentajeBebidas;
    }

    /**
     * @return the alimentos
     */
    public float getAlimentos() {
        return alimentos;
    }

    /**
     * @param alimentos the alimentos to set
     */
    public void setAlimentos(float alimentos) {
        this.alimentos = alimentos;
    }

    /**
     * @return the porcentajeAlimentos
     */
    public float getPorcentajeAlimentos() {
        return porcentajeAlimentos;
    }

    /**
     * @param porcentajeAlimentos the porcentajeAlimentos to set
     */
    public void setPorcentajeAlimentos(float porcentajeAlimentos) {
        this.porcentajeAlimentos = porcentajeAlimentos;
    }

    /**
     * @return the otros
     */
    public float getOtros() {
        return otros;
    }

    /**
     * @param otros the otros to set
     */
    public void setOtros(float otros) {
        this.otros = otros;
    }

    /**
     * @return the procentajeOtros
     */
    public float getProcentajeOtros() {
        return procentajeOtros;
    }

    /**
     * @param procentajeOtros the procentajeOtros to set
     */
    public void setProcentajeOtros(float procentajeOtros) {
        this.procentajeOtros = procentajeOtros;
    }

    /**
     * @return the ventaTotal
     */
    public float getVentaTotal() {
        return ventaTotal;
    }

    /**
     * @param ventaTotal the ventaTotal to set
     */
    public void setVentaTotal(float ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    /**
     * @return the impuestos
     */
    public float getImpuestos() {
        return impuestos;
    }

    /**
     * @param impuestos the impuestos to set
     */
    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    /**
     * @return the descuentos
     */
    public float getDescuentos() {
        return descuentos;
    }

    /**
     * @param descuentos the descuentos to set
     */
    public void setDescuentos(float descuentos) {
        this.descuentos = descuentos;
    }

    /**
     * @return the cuentasAbiertas
     */
    public int getCuentasAbiertas() {
        return cuentasAbiertas;
    }

    /**
     * @param cuentasAbiertas the cuentasAbiertas to set
     */
    public void setCuentasAbiertas(int cuentasAbiertas) {
        this.cuentasAbiertas = cuentasAbiertas;
    }

    /**
     * @return the cuentasImpresas
     */
    public int getCuentasImpresas() {
        return cuentasImpresas;
    }

    /**
     * @param cuentasImpresas the cuentasImpresas to set
     */
    public void setCuentasImpresas(int cuentasImpresas) {
        this.cuentasImpresas = cuentasImpresas;
    }

    /**
     * @return the cuentasCerradas
     */
    public int getCuentasCerradas() {
        return cuentasCerradas;
    }

    /**
     * @param cuentasCerradas the cuentasCerradas to set
     */
    public void setCuentasCerradas(int cuentasCerradas) {
        this.cuentasCerradas = cuentasCerradas;
    }

    /**
     * @return the cuentasPendientes
     */
    public int getCuentasPendientes() {
        return cuentasPendientes;
    }

    /**
     * @param cuentasPendientes the cuentasPendientes to set
     */
    public void setCuentasPendientes(int cuentasPendientes) {
        this.cuentasPendientes = cuentasPendientes;
    }
}
