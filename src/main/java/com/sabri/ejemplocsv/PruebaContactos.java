package com.sabri.ejemplocsv;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PruebaContactos {
    public static void main(String[] args) {
        grabarContactos();
        leerContactos();
    }
    
    public static void leerContactos() {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos/contactos.csv"))) {
            CsvToBean csvReader = new CsvToBeanBuilder(reader)
                    .withType(Contacto.class)
                    .build();
            
            for(Contacto c : (Iterable<Contacto>) csvReader)
                System.out.println(c);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void grabarContactos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos/contactos.csv", true))) {
            StatefulBeanToCsv csvWriter = new StatefulBeanToCsvBuilder<Contacto>(writer)
                    .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withLineEnd(CSVWriter.DEFAULT_LINE_END)
                    .build();
            
            csvWriter.write(new Contacto(5, "Gilipollas", "123456789"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
