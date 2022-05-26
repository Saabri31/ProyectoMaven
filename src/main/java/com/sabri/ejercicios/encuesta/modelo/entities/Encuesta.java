/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.ejercicios.encuesta.modelo.entities;

/**
 *
 * @author todbolsa
 */
public class Encuesta {

    public Encuesta(int identificador, int si, int no, int ns) {
        this.identificador = identificador;
        this.si = si;
        this.no = no;
        this.ns = ns;
    }

    private int identificador;
    private int si;
    private int no;
    private int ns;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getSi() {
        return si;
    }

    public void setSi(int si) {
        this.si = si;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    @Override
    public String toString() {
        return "Encuesta{" + "identificador=" + identificador + ", si=" + si + ", no=" + no + ", ns=" + ns + '}';
    }

}
