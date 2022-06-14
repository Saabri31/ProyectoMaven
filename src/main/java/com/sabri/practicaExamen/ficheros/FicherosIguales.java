/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen.ficheros;

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
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta 1");
        String ruta1 = sc.nextLine();
        File archivo1 = new File(ruta1);
        FileReader fr1 = new FileReader(archivo1);
        BufferedReader br1 = new BufferedReader(fr1);
        String linea1;
        String contenido1 = "";
        while ((linea1 = br1.readLine()) != null) {
            contenido1 += linea1;
        }

        br1.close();
        
        
        try (BufferedReader reader =  new BufferedReader(new FileReader(new File(ruta1)))) {
            while (reader.ready()) {
                contenido1 += reader.readLine();
            }
        }

    }

}
