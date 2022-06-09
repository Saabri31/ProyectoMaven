/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class FicherosIguales {

    /**
     * NO ENTRA en el puto BUCLEEEEEE AYUDAAAAAAAAaaaAAAAaaaaAaaAaAAA
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta 1");
        String ruta1 = ruta1 = sc.nextLine();
        System.out.println("Introduce la ruta 2");
        String ruta2 = ruta1 = sc.nextLine();
        File archivo1 = new File(ruta1);
        File archivo2 = new File(ruta2);
        FileReader fr1 = new FileReader(archivo1);
        BufferedReader br1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader(archivo2);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea1;
        String contenido1 = "";
        String linea2;
        String contenido2 = "";
        while ((linea1 = br1.readLine()) != null) {
            System.out.println("Contenido uno");
            contenido1 += linea1;
        }
        while ((linea2 = br2.readLine()) != null) {
            System.out.println("Contenido dos");
            contenido2 += linea2;
        }

        System.out.println(contenido1.equals(contenido2));

        br1.close();
        br2.close();

    }

}
