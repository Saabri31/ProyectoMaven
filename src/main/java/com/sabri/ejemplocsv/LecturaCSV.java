/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.ejemplocsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author todbolsa
 */
public class LecturaCSV {

    public static List<String[]> readAll(Reader reader) throws CsvException {
        List<String[]> contenido = new ArrayList();
        try (CSVReader csvReader = new CSVReader(reader)) {
            contenido = csvReader.readAll();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return contenido;
    }

    public static List<String[]> readLines(Reader reader) {
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos/datosCSV.csv"));
            System.out.println("Lectura completa");
            for (String[] linea : readAll(br)) {
                System.out.println(linea[0] + "\t");
            }
        } catch (CsvException ex) {

        }
    }
}
