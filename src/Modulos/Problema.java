/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

/**
 *
 * @author dayan
 */
public class Problema {
    private int id;
    private String desarrollo;
    private int objArea;

    public Problema() {
    }

    public Problema(int id, String desarrollo, int objArea) {
        this.id = id;
        this.desarrollo = desarrollo;
        this.objArea = objArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public int getObjArea() {
        return objArea;
    }

    public void setObjArea(int objArea) {
        this.objArea = objArea;
    }
    
    
}
