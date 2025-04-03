/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author XX3
 */
public class Compra {
    int id_compra;
    int id_producto;
    int id_proveedor;
    String nombre_producto;
    String nombre_proveedor;
    
    public Compra(int id_compra, int id_producto, int id_proveedor, String nombre_producto, String nombre_proveedor) {
        this.id_compra = id_compra;
        this.id_producto = id_producto;
        this.id_proveedor = id_proveedor;
        this.nombre_producto = nombre_producto;
        this.nombre_proveedor = nombre_proveedor;
    }

    public Compra() {
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
   
}
