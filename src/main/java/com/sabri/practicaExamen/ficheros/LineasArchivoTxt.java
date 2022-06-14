/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaExamen.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class LineasArchivoTxt {

    /**
     * Se borra el texto, no se porke, ayuda
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        String ruta = ruta = sc.nextLine();
//        File file = new File(ruta);
//        String input = "";
//        String line;
//        int count = 1;
//        FileReader reader = new FileReader(file);
//        BufferedReader br = new BufferedReader(reader);
//        FileWriter fw = new FileWriter(file, false);
//        BufferedWriter bw = new BufferedWriter(fw);
//        while ((line = br.readLine()) != null) {
//            input += count + "." + line + "\n";
//            count++;
//        }
//        bw.write(input);
//        bw.close();

        System.out.println("Introduce la ubicacion del archivo");
        final File archivo = new File(sc.nextLine());
        if (!archivo.canRead() || !archivo.canWrite()) {
            System.out.println("No se puede operar el archivo");
            System.exit(1);
        }
        List<String> lines = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(archivo))) {
            while (read.ready()) {
                lines.add(read.readLine());
            }
        }

        try (BufferedWriter write = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < lines.size(); i++) {
                write.write((i + 1) + "." + lines.get(i));
                if (i + 1 != lines.size())
                    write.newLine();
            }
        }

    }

}
