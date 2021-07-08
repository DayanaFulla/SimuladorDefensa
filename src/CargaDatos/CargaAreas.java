/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;
import Modulos.Area;
import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author dayan
 */
public class CargaAreas {
    private ArrayList<Area> listaArea;
    
    public ArrayList<Area> cargaArrayArea(){
        listaArea=new ArrayList<>();
        listaArea.add(new Area(1, "Taller Ingeniería de Sistemas"));
        listaArea.add(new Area(2, "Taller de métodos de Programación"));
        listaArea.add(new Area(3, "Taller de Diseño y Gestión de Base de Datos"));
        listaArea.add(new Area(4, "Taller de Infraestructura y Seguridad"));
        return listaArea;
    }
    
    public String ObtenerLista(ArrayList<Area> areas){
        String stAreas="";
        for (int i = 0; i < areas.size(); i++) {
            stAreas=stAreas+areas.get(i).getTitulo()+ "\n";
        }
        return stAreas;
    }
    
    public String ElegirArea(ArrayList<Area> areas){
        int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, 4);
        String eleccion=areas.get(numeroAleatorio).getTitulo();
        return eleccion;
    }
    
    public Area ElegirAreaObj(ArrayList<Area> areas){
        int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, 4);
        return areas.get(numeroAleatorio);
    }
}
