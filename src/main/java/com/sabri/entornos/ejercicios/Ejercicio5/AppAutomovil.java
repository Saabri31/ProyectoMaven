/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class AppAutomovil {
    public static void main(String[] args) {
        
        Automovil coche = new Automovil("Seat", 5, 240, 100);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 1 para arrancar");
        System.out.println("Introduce 2 para parar");
        System.out.println("Introduce 3 para repostar");
        System.out.println("Introduce 4 para acelerar");
        System.out.println("Introduce 5 para decelerar");
        System.out.println("Introduce 6 para entrar al vehiculo");
        System.out.println("Introduce 7 para salir del vehiculo");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println(coche.arrancar(true));
                break;
            case 2:
                System.out.println(coche.parar(true));
                break;
            case 3:
                System.out.println("Introduce la cantidad a repostar");
                double gasolina = sc.nextInt();
                System.out.println(coche.repostar(gasolina));
                break;
            case 4: 
                System.out.println(coche.acelerar());
                break;
            case 5:
                System.out.println(coche.decelerar());
                break;
            case 6:
                System.out.println(coche.repostar(opcion));
                break;
            case 7:
                System.out.println(coche.repostar(opcion));
                break;
            default:
                System.out.println("No corresponde a ninguna opcion");
                break;
        }
        
    }
}
