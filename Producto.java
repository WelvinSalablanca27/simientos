/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


/**
 *
 * @author XX3
 */
public class Producto {
    int id_producto;
    String nombre_producto;
    double precio_venta;
    double precio_compra;
    int cantidad_existente;
    int id_tipoproducto;
    String fecha_caducidad;

    public Producto(int id_producto, String nombre_producto, double precio_venta, double precio_compra, int cantidad_existente, int id_tipoproducto, String fecha_caducidad) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_venta = precio_venta;
        this.precio_compra = precio_compra;
        this.cantidad_existente = cantidad_existente;
        this.id_tipoproducto = id_tipoproducto;
        this.fecha_caducidad = fecha_caducidad;
    }

    public Producto() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getCantidad_existente() {
        return cantidad_existente;
    }

    public void setCantidad_existente(int cantidad_existente) {
        this.cantidad_existente = cantidad_existente;
    }

    public int getId_tipoproducto() {
        return id_tipoproducto;
    }

    public void setId_tipoproducto(int id_tipoproducto) {
        this.id_tipoproducto = id_tipoproducto;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
    
}
