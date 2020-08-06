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
public class Ventas {
    private int idventas;
    private int idcliente;
    private String nombempresa;
    private String fechasalida;
    private String obervaciones;
    private String estado;

    public Ventas() {
    }

    public Ventas(int idventas, int idcliente, String nombempresa, String fechasalida, String obervaciones, String estado) {
        this.idventas = idventas;
        this.idcliente = idcliente;
        this.nombempresa = nombempresa;
        this.fechasalida = fechasalida;
        this.obervaciones = obervaciones;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombempresa() {
        return nombempresa;
    }

    public void setNombempresa(String nombempresa) {
        this.nombempresa = nombempresa;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getObervaciones() {
        return obervaciones;
    }

    public void setObervaciones(String obervaciones) {
        this.obervaciones = obervaciones;
    }
    
    
}
