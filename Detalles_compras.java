/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author XX3
 */
public class Detalles_compras {
    int id_detallecompra;
    int id_compra;
    String fecha_ingresado;
    String fecha_caducidad;
    double valor_compra;
    
    public Detalles_compras(int id_detallecompra, int id_compra, String fecha_ingresado, String fecha_caducidad, double valor_compra) {
        this.id_detallecompra = id_detallecompra;
        this.id_compra = id_compra;
        this.fecha_ingresado = fecha_ingresado;
        this.fecha_caducidad = fecha_caducidad;
        this.valor_compra = valor_compra;
    }

    public Detalles_compras() {
    }

    public int getId_detallecompra() {
        return id_detallecompra;
    }

    public void setId_detallecompra(int id_detallecompra) {
        this.id_detallecompra = id_detallecompra;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getFecha_ingresado() {
        return fecha_ingresado;
    }

    public void setFecha_ingresado(String fecha_ingresado) {
        this.fecha_ingresado = fecha_ingresado;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }
   
}
