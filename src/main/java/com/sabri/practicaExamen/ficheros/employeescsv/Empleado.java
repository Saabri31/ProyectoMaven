/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen.ficheros.employeescsv;

import com.opencsv.bean.CsvBindByName;

/**
 *
 * @author macarena
 */
public class Empleado implements Comparable<Empleado> {

    @CsvBindByName(column = "EMPLOYEE_ID")
    private String idEmpleado;
    @CsvBindByName(column = "FIRST_NAME")
    private String nombre;
    @CsvBindByName(column = "LAST_NAME")
    private String apellidos;
    @CsvBindByName(column = "DEPARTMENT_NAME")
    private String departamento;

    public Empleado() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(idEmpleado);
        sb.append("\t").append(nombre);
        sb.append(" - ").append(apellidos);
        sb.append("\t\t").append("(" + departamento + ")");
        return sb.toString();
    }

    @Override
    public int compareTo(Empleado o) {
        return Integer.parseInt(this.idEmpleado) - Integer.parseInt(o.getIdEmpleado());
    }

}
