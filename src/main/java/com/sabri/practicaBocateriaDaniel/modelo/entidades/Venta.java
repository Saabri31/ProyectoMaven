/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.practicaBocateriaDaniel.modelo.entidades;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 *
 * @author danip
 */
public class Venta {
    private int id;
    private LocalDateTime fechaHora;
    private String empleado;
    private double total;
    private HashMap<String,Integer> productos = new HashMap<String,Integer>();
   

    public Venta(int id,LocalDateTime fechaHora, String empleado, HashMap<String, Integer> productos,double total) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.empleado = empleado;
        this.total = total;
        this.productos=productos;
                
    }

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Integer> productos) {
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
     public  void addProducto(Producto producto){
        
        if(this.productos.containsKey(producto.getNombre())==true){
            int cantidad=productos.get(producto.getNombre())+1;
            this.productos.replace(producto.getNombre(),cantidad);
            
        }
        else{
            this.productos.put(producto.getNombre(),1);
            
        }
        
        
        
        
    }

    public void imprimirTicket() {
        Ticket ticket = new Ticket(this.id,this.fechaHora,this.empleado,this.total,this.productos);
        ticket.toString();
    }
    
}
