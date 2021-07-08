/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladordefensa;

import CargaDatos.CargaAreas;
import CargaDatos.CargaPreguntas;
import CargaDatos.CargaProblemas;
import Modulos.Area;
import Modulos.Preguntas;
import Modulos.Problema;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**
 *
 * @author dayan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String dato="";
        dato="ELECCIÓN DE ÁREA:  \n";
        CargaAreas ca=new CargaAreas();
        ArrayList<Area> areas=ca.cargaArrayArea();
        Area a=ca.ElegirAreaObj(areas);
        dato=dato+a.getTitulo()+" \n";
        
        CargaProblemas cpb=new CargaProblemas();
        ArrayList<Problema> problemas=cpb.cargaArrayProblemas();
        dato=dato+"PROBLEMA: \n";
        try {
            dato=dato+cpb.ElegirProblema(problemas, a.getId());
        } catch (Exception e) {
            dato=dato+"Aún no hay problemas de esta área \n";
        }
        
        CargaPreguntas cp= new CargaPreguntas();
        ArrayList<Preguntas> preguntas=cp.cargaArrayPreguntas();
        dato=dato+"PREGUNTAS: \n";
        dato=dato+cp.ElegirPreguntasSinRepeit(preguntas);
        
        try {
            XWPFDocument document=new XWPFDocument();
            FileOutputStream out=new FileOutputStream(new File("C:\\Users\\dayan\\Documents\\Archivos\\SimuladorDefensa.docx"));
            XWPFParagraph paragraph=document.createParagraph();
            XWPFRun run=paragraph.createRun();
            run.setText(dato);
            document.write(out);
            out.close();
//            System.out.println(dato);
            System.out.println("Archivo Creado");
        } catch (Exception e) {
            System.out.println("Error");
        }
            
      
        
        
        
    }
    
}
