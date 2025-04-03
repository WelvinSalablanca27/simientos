/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author XX3
 */
public class Proveedor {
   int id_proveedor;
    String nombre_proveedor;
    String tipo_distribuidor;
    String telefono_proveedor;
    
    public Proveedor(int id_proveedor, String nombre_proveedor, String tipo_distribuidor, String telefono_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.tipo_distribuidor = tipo_distribuidor;
        this.telefono_proveedor = telefono_proveedor;
    }

    public Proveedor() {
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getTipo_distribuidor() {
        return tipo_distribuidor;
    }

    public void setTipo_distribuidor(String tipo_distribuidor) {
        this.tipo_distribuidor = tipo_distribuidor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }
 
}
