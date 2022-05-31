/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateriaDaniel.modelo.entidades;

/**
 *
 * @author todbolsa
 */
public class Empleado {

    private String id;
    private String nombre;
    private int comision;

    public Empleado(String id, String nombre, int comision) {
        this.id = id;
        this.nombre = nombre;
        this.comision = comision;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", comision=" + comision + '}';
    }

}
