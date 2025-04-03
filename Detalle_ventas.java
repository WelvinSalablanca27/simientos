/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author XX3
 */
public class Detalle_ventas {
    int id_detalleventa;
    int id_producto;
    int id_venta;
    int cantidad_producto;
    double cantidad;
    
    public Detalle_ventas(int id_detalleventa, int id_producto, int id_venta, int cantidad_producto, double cantidad) {
        this.id_detalleventa = id_detalleventa;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
        this.cantidad_producto = cantidad_producto;
        this.cantidad = cantidad;
    }

    public Detalle_ventas() {
    }

    public int getId_detalleventa() {
        return id_detalleventa;
    }

    public void setId_detalleventa(int id_detalleventa) {
        this.id_detalleventa = id_detalleventa;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
