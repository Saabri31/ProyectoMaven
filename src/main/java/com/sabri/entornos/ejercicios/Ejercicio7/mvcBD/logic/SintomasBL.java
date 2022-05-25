/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.logic;

import com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.entities.Sintomas;
import com.sabri.entornos.ejercicios.Ejercicio7.mvcBD.dao.SintomasDAO;
import java.sql.SQLException;

/**
 *
 * @author todbolsa
 */
public class SintomasBL {

    public static String alta(Sintomas s) throws SQLException {
        //compruebo que el registro no existe
//        Sintomas sintomas = SintomasDAO.get(s.getId());
        Sintomas sintomas = new Sintomas();
        String message = "";

        if (sintomas == null) {
            if (SintomasDAO.insert(s) > 0) {
                message = "Alta realizada correctamente";
            } else {
                sintomas.setFiebre(sintomas.getFiebre() + 1);
                sintomas.setTos(sintomas.getTos() + 1);
                sintomas.setDiarrea(sintomas.getDiarrea() + 1);
                sintomas.setDolor(sintomas.getDolor() + 1);
                sintomas.setOlfato(sintomas.getOlfato() + 1);
                if (SintomasDAO.update(s) > 0) {
                    message = "Actualizacion realizada correctamente";
                }
            }
        }
        return message;
    }

}
