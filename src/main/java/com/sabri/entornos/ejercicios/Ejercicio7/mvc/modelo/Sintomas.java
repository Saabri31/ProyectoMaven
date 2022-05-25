/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvc.modelo;

/**
 *
 * @author todbolsa
 */
public class Sintomas {

    private int fiebre;
    private int tosSeca;
    private int diarrea;
    private int dolorMuscular;
    private int olfato;

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        this.fiebre = fiebre;
    }

    public int getTosSeca() {
        return tosSeca;
    }

    public void setTosSeca(int tosSeca) {
        this.tosSeca = tosSeca;
    }

    public int getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(int diarrea) {
        this.diarrea = diarrea;
    }

    public int getDolorMuscular() {
        return dolorMuscular;
    }

    public void setDolorMuscular(int dolorMuscular) {
        this.dolorMuscular = dolorMuscular;
    }

    public int getOlfato() {
        return olfato;
    }

    public void setOlfato(int olfato) {
        this.olfato = olfato;
    }

    @Override
    public String toString() {
        return "Sintomas{" + "fiebre=" + fiebre + ", tosSeca=" + tosSeca + ", diarrea=" + diarrea + ", dolorMuscular=" + dolorMuscular + ", olfato=" + olfato + '}';
    }

}
