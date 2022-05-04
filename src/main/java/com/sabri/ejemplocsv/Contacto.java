package com.sabri.ejemplocsv;

import com.opencsv.bean.CsvBindByName;
import java.io.Serializable;

public class Contacto implements Serializable{
    
    @CsvBindByName (column = "id")
    private Integer idContacto;
    @CsvBindByName
    private String nombre;
    @CsvBindByName
    private String tf;

    public Contacto() {}
    
    public Contacto(int idContacto, String nombre, String tf) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.tf = tf;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    @Override
    public String toString() {
        return "Contacto{" + "idContacto=" + idContacto + ", nombre=" + nombre + ", tf=" + tf + '}';
    }
    
}
