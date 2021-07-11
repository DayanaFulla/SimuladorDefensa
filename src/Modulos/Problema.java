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
    private String desarrollo;
    private int objArea;

    public Problema() {
    }

    public Problema(String desarrollo, int objArea) {
        this.desarrollo = desarrollo;
        this.objArea = objArea;
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
