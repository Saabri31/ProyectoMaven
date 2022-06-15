/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion.ejercicio2;

/**
 *
 * @author examen3
 */
public class Movimiento {

    private int id;
    private String cif;
    private String nombre;
    private String operacion;

    public Movimiento(int id_movimiento, String cif, String nombre, String operacion) {
        this.id = id_movimiento;
        this.cif = cif;
        this.nombre = nombre;
        this.operacion = operacion;
    }

    public int getId_movimiento() {
        return id;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOperacion() {
        return operacion;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", operacion=" + operacion + '}';
    }

}
