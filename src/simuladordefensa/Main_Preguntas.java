/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordefensa;

import CargaDatos.CargaAreas;
import CargaDatos.CargaPreguntas;
import Modulos.Area;
import Modulos.Preguntas;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class Main_Preguntas {

    /**
     * 1, "Taller Ingeniería de Sistemas"
       2, "Taller de métodos de Programación"
       3, "Taller de Diseño y Gestión de Base de Datos"
       4, "Taller de Infraestructura y Seguridad"
     */
    public static void main(String[] args) {
        String dato="";
        CargaPreguntas cp= new CargaPreguntas();
        ArrayList<Preguntas> preguntas=cp.cargaArrayPreguntas();
        dato=dato+"PREGUNTAS: \n";
        dato=dato+cp.ElegirPreguntasSinRepeitArea(preguntas, 1);
        System.out.println(dato);
    }
    
}
