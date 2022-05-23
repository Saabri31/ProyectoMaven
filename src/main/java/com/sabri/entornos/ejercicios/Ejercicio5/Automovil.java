/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio5;

/**
 *
 * @author todbolsa
 */
public class Automovil {

   private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private double deposito;
    private boolean arrancado;
    private int velocidad;
    private int velocidadMax;
    private double capacidadDepo;
    private int capacidadPers;
    private int personas;

    public Automovil(String matricula, int capacidadPers, int velocidadMax, double capacidadDepo) {

        this.matricula = matricula;
        this.capacidadPers = capacidadPers;
        this.velocidadMax = velocidadMax;
        this.capacidadDepo = capacidadDepo;

    }

    public String arrancar(boolean arrancado) {
        this.arrancado = arrancado;
        if(arrancado){
            return "Ahora el vehiculo esta en funcionamiento";
        }
        else return "El vehiculo esta apagado";
    }

    public String parar(boolean arrancado) {
        this.arrancado = arrancado;
        if(arrancado){
            return "Ahora el vehiculo esta parado";
        }
        else return "El vehiculo esta en marcha";
    }

    public String repostar(double gasolina) {
        this.deposito += gasolina;
        if (this.deposito > this.capacidadDepo) {
            this.deposito -= gasolina;
            return "Has sobrepasado el limite del deposito";
        } else return "Ahora el deposito tiene "
                    + this.deposito + " litros";
    }
    
    public String acelerar(){
        this.deposito -= 0.5;
        this.velocidad += 10;
        if(this.velocidad>this.velocidadMax){
            this.velocidad -=10;
            this.deposito += 0.5;
            return "La velocidad sobrepasa la velocidad maxima";
        }else if(this.deposito < 0){
            this.velocidad -=10;
            this.deposito += 0.5;
            return "No te queda gasolina para acelerar";
        }
        else return "El automovil ahora va a " + this.velocidad + "km/h";
    }
    
    public String decelerar(){
        this.velocidad -= 5;
        if(this.velocidad < 0){
            this.velocidad +=5;
            return "La velocidad no puede ser negativa";
        }
        else return "El automovil ahora va a " + this.velocidad + "km/h";
    }

    public String entrar(int personas) {
        this.personas += personas;
        if (this.personas > this.capacidadPers) {
            this.personas -= personas;
            return "No pueden entrar mas personas legalmente";
        } else {
            return "Ahora hay " + this.personas + " personas en el automovil";
        }
    }

    public String salir(int personas) {
        this.personas -= personas;
        if (this.personas < 0) {
            this.personas += personas;
            return "No hay mas personas en el automovil";
        } else {
            return "Ahora hay " + this.personas + " personas en el automovil";
        }
    }
    
    
    @Override
    public String toString() {
        return "Automovil{" + "deposito=" + deposito + ", velocidad=" + velocidad + ", personas=" + personas + '}';
    }
    
}
