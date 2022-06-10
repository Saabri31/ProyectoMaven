/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class Dir {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ruta = "";
        File file;
        ruta = sc.nextLine();
        file = new File(ruta);
        if (file.isDirectory()) {
            File[] lista = file.listFiles();
            dir(lista);
        } else {
            System.out.println("No es una ruta válida");
        }
    }

    public static void dir(File... files) {
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i].getName() + " ");
        }
    }

}
