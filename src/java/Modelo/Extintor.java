/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Swift
 */
public class Extintor {
    private int idextintor;
    private int idserie;
    private String marca;
    private String modelo;
    private String observaciones;
    private String estado;

    public Extintor() {
    }

    public Extintor(int idextintor, int idserie, String marca, String modelo, String observaciones, String estado) {
        this.idextintor = idextintor;
        this.idserie = idserie;
        this.marca = marca;
        this.modelo = modelo;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdextintor() {
        return idextintor;
    }

    public void setIdextintor(int idextintor) {
        this.idextintor = idextintor;
    }

    public int getIdserie() {
        return idserie;
    }

    public void setIdserie(int idserie) {
        this.idserie = idserie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
