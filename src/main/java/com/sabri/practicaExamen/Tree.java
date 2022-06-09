/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "";
        File file;
        ruta = sc.nextLine();
        file = new File(ruta);
        if (file.isDirectory()) {
            tree(file);
        } else {
            System.out.println("Debes seleccionar un directorio");
        }
    }

    public static void tree(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println(files[i].getName());
                tree(files[i]);
            } else {
                System.out.println("---" + files[i].getName());
            }
        }
    }
}
