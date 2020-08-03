/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Ventas {
    private int ideproducto;
    private String nombre;
    private double precio;
    private int cantidad;
    private String estado;

    public Ventas(int ideproducto, String nombre, double precio, int cantidad, String estado) {
        this.ideproducto = ideproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdeproducto() {
        return ideproducto;
    }

    public void setIdeproducto(int ideproducto) {
        this.ideproducto = ideproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
