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
    
    private float bebidasAbi=0.0f;
    private float porcentajeBebidasAbi=0.0f;
    private float alimentosAbi=0.0f;
    private float porcentajeAlimentosAbi=0.0f;
    private float otrosAbi=0.0f;
    private float procentajeOtrosAbi=0.0f;
    private float ventaTotalAbi=0.0f;
    private float impuestosAbi=0.0f;
    private float descuentosAbi=0.0f;

    private float bebidasPen=0.0f;
    private float porcentajeBebidasPen=0.0f;
    private float alimentosPen=0.0f;
    private float porcentajeAlimentosPen=0.0f;
    private float otrosPen=0.0f;
    private float procentajeOtrosPen=0.0f;
    private float ventaTotalPen=0.0f;
    private float impuestosPen=0.0f;
    private float descuentosPen=0.0f;

    private int cuentasAbiertas=0;
    private int cuentasImpresas=0;
    private int cuentasCerradas=0;
    private int cuentasPendientes;   
    
    /**
     * @return the bebidasAbi
     */
    public float getBebidasAbi() {
        return bebidasAbi;
    }

    /**
     * @param bebidasAbi the bebidasAbi to set
     */
    public void setBebidasAbi(float bebidasAbi) {
        this.bebidasAbi = bebidasAbi;
    }

    /**
     * @return the porcentajeBebidasAbi
     */
    public float getPorcentajeBebidasAbi() {
        return porcentajeBebidasAbi;
    }

    /**
     * @param porcentajeBebidasAbi the porcentajeBebidasAbi to set
     */
    public void setPorcentajeBebidasAbi(float porcentajeBebidasAbi) {
        this.porcentajeBebidasAbi = porcentajeBebidasAbi;
    }

    /**
     * @return the alimentosAbi
     */
    public float getAlimentosAbi() {
        return alimentosAbi;
    }

    /**
     * @param alimentosAbi the alimentosAbi to set
     */
    public void setAlimentosAbi(float alimentosAbi) {
        this.alimentosAbi = alimentosAbi;
    }

    /**
     * @return the porcentajeAlimentosAbi
     */
    public float getPorcentajeAlimentosAbi() {
        return porcentajeAlimentosAbi;
    }

    /**
     * @param porcentajeAlimentosAbi the porcentajeAlimentosAbi to set
     */
    public void setPorcentajeAlimentosAbi(float porcentajeAlimentosAbi) {
        this.porcentajeAlimentosAbi = porcentajeAlimentosAbi;
    }

    /**
     * @return the otrosAbi
     */
    public float getOtrosAbi() {
        return otrosAbi;
    }

    /**
     * @param otrosAbi the otrosAbi to set
     */
    public void setOtrosAbi(float otrosAbi) {
        this.otrosAbi = otrosAbi;
    }

    /**
     * @return the procentajeOtrosAbi
     */
    public float getProcentajeOtrosAbi() {
        return procentajeOtrosAbi;
    }

    /**
     * @param procentajeOtrosAbi the procentajeOtrosAbi to set
     */
    public void setProcentajeOtrosAbi(float procentajeOtrosAbi) {
        this.procentajeOtrosAbi = procentajeOtrosAbi;
    }

    /**
     * @return the ventaTotalAbi
     */
    public float getVentaTotalAbi() {
        return ventaTotalAbi;
    }

    /**
     * @param ventaTotalAbi the ventaTotalAbi to set
     */
    public void setVentaTotalAbi(float ventaTotalAbi) {
        this.ventaTotalAbi = ventaTotalAbi;
    }

    /**
     * @return the impuestosAbi
     */
    public float getImpuestosAbi() {
        return impuestosAbi;
    }

    /**
     * @param impuestosAbi the impuestosAbi to set
     */
    public void setImpuestosAbi(float impuestosAbi) {
        this.impuestosAbi = impuestosAbi;
    }

    /**
     * @return the descuentosAbi
     */
    public float getDescuentosAbi() {
        return descuentosAbi;
    }

    /**
     * @param descuentosAbi the descuentosAbi to set
     */
    public void setDescuentosAbi(float descuentosAbi) {
        this.descuentosAbi = descuentosAbi;
    }

    /**
     * @return the bebidasPen
     */
    public float getBebidasPen() {
        return bebidasPen;
    }

    /**
     * @param bebidasPen the bebidasPen to set
     */
    public void setBebidasPen(float bebidasPen) {
        this.bebidasPen = bebidasPen;
    }

    /**
     * @return the porcentajeBebidasPen
     */
    public float getPorcentajeBebidasPen() {
        return porcentajeBebidasPen;
    }

    /**
     * @param porcentajeBebidasPen the porcentajeBebidasPen to set
     */
    public void setPorcentajeBebidasPen(float porcentajeBebidasPen) {
        this.porcentajeBebidasPen = porcentajeBebidasPen;
    }

    /**
     * @return the alimentosPen
     */
    public float getAlimentosPen() {
        return alimentosPen;
    }

    /**
     * @param alimentosPen the alimentosPen to set
     */
    public void setAlimentosPen(float alimentosPen) {
        this.alimentosPen = alimentosPen;
    }

    /**
     * @return the porcentajeAlimentosPen
     */
    public float getPorcentajeAlimentosPen() {
        return porcentajeAlimentosPen;
    }

    /**
     * @param porcentajeAlimentosPen the porcentajeAlimentosPen to set
     */
    public void setPorcentajeAlimentosPen(float porcentajeAlimentosPen) {
        this.porcentajeAlimentosPen = porcentajeAlimentosPen;
    }

    /**
     * @return the otrosPen
     */
    public float getOtrosPen() {
        return otrosPen;
    }

    /**
     * @param otrosPen the otrosPen to set
     */
    public void setOtrosPen(float otrosPen) {
        this.otrosPen = otrosPen;
    }

    /**
     * @return the procentajeOtrosPen
     */
    public float getProcentajeOtrosPen() {
        return procentajeOtrosPen;
    }

    /**
     * @param procentajeOtrosPen the procentajeOtrosPen to set
     */
    public void setProcentajeOtrosPen(float procentajeOtrosPen) {
        this.procentajeOtrosPen = procentajeOtrosPen;
    }

    /**
     * @return the ventaTotalPen
     */
    public float getVentaTotalPen() {
        return ventaTotalPen;
    }

    /**
     * @param ventaTotalPen the ventaTotalPen to set
     */
    public void setVentaTotalPen(float ventaTotalPen) {
        this.ventaTotalPen = ventaTotalPen;
    }

    /**
     * @return the impuestosPen
     */
    public float getImpuestosPen() {
        return impuestosPen;
    }

    /**
     * @param impuestosPen the impuestosPen to set
     */
    public void setImpuestosPen(float impuestosPen) {
        this.impuestosPen = impuestosPen;
    }

    /**
     * @return the descuentosPen
     */
    public float getDescuentosPen() {
        return descuentosPen;
    }

    /**
     * @param descuentosPen the descuentosPen to set
     */
    public void setDescuentosPen(float descuentosPen) {
        this.descuentosPen = descuentosPen;
    }
 

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
