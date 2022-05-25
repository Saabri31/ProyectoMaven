/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.entities;

/**
 *
 * @author todbolsa
 */
public class Sintomas {
    
    private int id;
    private int fiebre;
    private int tos;
    private int diarrea;
    private int dolor;
    private int olfato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        this.fiebre = fiebre;
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

    public int getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(int diarrea) {
        this.diarrea = diarrea;
    }

    public int getDolor() {
        return dolor;
    }

    public void setDolor(int dolor) {
        this.dolor = dolor;
    }

    public int getOlfato() {
        return olfato;
    }

    public void setOlfato(int olfato) {
        this.olfato = olfato;
    }

    @Override
    public String toString() {
        return "Sintomas{" + "id=" + id + ", fiebre=" + fiebre + ", tos=" + tos + ", diarrea=" + diarrea + ", dolor=" + dolor + ", olfato=" + olfato + '}';
    }
    
}
