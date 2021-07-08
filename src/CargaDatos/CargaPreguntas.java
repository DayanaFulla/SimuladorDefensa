/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;

import Modulos.Preguntas;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author dayan
 */
public class CargaPreguntas {
    private ArrayList<Preguntas> listaPreguntas;
    
    public ArrayList<Preguntas> cargaArrayPreguntas(){
        listaPreguntas=new ArrayList<>();
        
        int objArea=1;//Ingeniería de sistemas
        listaPreguntas.add(new Preguntas("¿Qué representa un actor del negocio? Dé ejemplo", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las categorías del actor de negocio?", objArea));
        listaPreguntas.add(new Preguntas("¿Dónde se encuentra a los actores del negocio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del analista de sistemas?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Diseñador?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Diseñador de Pruebas?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Programador/Implementador?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Administrador de Proyectos?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Administrador de Configuración?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Administrador de Proyectos?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el modelo de negocio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo se desarrolla el modelo de negocio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo se hace el modelo de negocios?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es un caso de uso?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué representan los objetos del dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué hace y qué representa el modelo de dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el objetivo del modelo de dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el uso de un modelo de dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo se describe el modelo de dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el objetivo de un modelo de dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo se elabora el modelo de dominio?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es Scrum?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo es el proceso?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las características de un manifiesto ágil?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo se compone el marco de trabajo Scrum?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Product Owner en Scrum?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el papel que cumple el rol del Scrum Master?", objArea));
        listaPreguntas.add(new Preguntas("¿De qué se encarga el Development Team?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el Product Backlog?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los tipos de elementos del product backlog?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué son las historias de Usuario?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el sprint backlog?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el incremento en Scrum?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué significa Done en Scrum?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los beneficios de los eventos/reuniones?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el sprint?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el sprint planning/poker planning?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuánto suele durar el sprint planning?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los objetivos del sprint o sprint goal?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los tipos de desperdicios del kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los principios del kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las principales reglas del kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las principales reglas de la medición del tiempo de kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué sucede con los roles en kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las funciones principales del kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las 6 reglas del kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las ventajas del kanban?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las desventajas del kanban?", objArea));
        listaPreguntas.add(new Preguntas("Explique la metodología o marco de trabajo", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las consideraciones que se deben tomar al  utilizar las métricas?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los componentes de las métricas?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los participantes de las métricas?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la aplicación de las métricas?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué objetivo tienen las métricas de funcionalidad?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué objetivo tienen las métricas de fiabilidad?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué objetivo tienen las métricas de usabilidad?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué objetivo tienen las métricas de eficiencia?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué objetivo tienen las métricas de mantenimiento?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué objetivo tienen las métricas de transportabilidad?", objArea));

        objArea=2;//Programación
        listaPreguntas.add(new Preguntas("Cuáles son los beneficios de utilizar buenas prácticas de programación", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son los convenios de código?", objArea)); 
        listaPreguntas.add(new Preguntas("Qué busca la programación defensiva?", objArea)); 
        listaPreguntas.add(new Preguntas("Formule la estructura del manejo de excepciones (control de errores)", objArea)); 
        listaPreguntas.add(new Preguntas("Logs y registros de Auditoría", objArea)); 
        listaPreguntas.add(new Preguntas("Tipos de Mensaje de log", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son los principios de la programación?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es la programación orientada a objetos?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Cuáles son las ventajas del POO?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué busca la POO?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son los elementos de la POO? Defina", objArea)); 
        listaPreguntas.add(new Preguntas("Cuál es la estructura de una clase?", objArea)); 
        listaPreguntas.add(new Preguntas("Componentes de una clase", objArea)); 
        listaPreguntas.add(new Preguntas("Cuál es la estructura de un atributo?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuál es el objetivo de un método?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuál es la estructura de un método?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son los modificadores de Acceso?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es la sobrecarga de métodos?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Cuáles son las características de la POO?", objArea)); 
        listaPreguntas.add(new Preguntas("Diga las características de la clase abstracta?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es una interface?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son las características de una interface?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son los otros tipos de clases?", objArea)); 
        listaPreguntas.add(new Preguntas("Qué es UML?", objArea)); 
        listaPreguntas.add(new Preguntas("Cuáles son los estereotipos del UML?", objArea)); 
        listaPreguntas.add(new Preguntas("Describa la estructura de una clase", objArea)); 
        listaPreguntas.add(new Preguntas("Identifique el significado de la sigla SOLID", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es la cohesión?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es el acoplamiento?", objArea)); 
        listaPreguntas.add(new Preguntas("En qué se basa el Single Responsibility Principle?", objArea)); 
        listaPreguntas.add(new Preguntas("De qué se trata el Open/Close principle", objArea)); 
        listaPreguntas.add(new Preguntas("Explique el Liskov Substitution Principle", objArea)); 
        listaPreguntas.add(new Preguntas("Explique el Interface Segregation Principle ", objArea)); 
        listaPreguntas.add(new Preguntas("Explique el Dependency Inversion Principle ", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es un nodo?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué es un grafo?", objArea)); 
        listaPreguntas.add(new Preguntas("De 3 ejemplos de patrones de diseño creacionales", objArea)); 
        listaPreguntas.add(new Preguntas("De 3 ejemplos de patrones de diseño estructurales", objArea)); 
        listaPreguntas.add(new Preguntas("De 3 ejemplos de patrones de diseño de comportamiento", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son las estructuras de datos?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son los arrays?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son las listas enlazadas?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son las pilas?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son las colas?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son los árboles binarios?", objArea)); 
        listaPreguntas.add(new Preguntas("¿Qué son los árboles de búsqueda?", objArea)); 

        objArea=3;//base de datos
        listaPreguntas.add(new Preguntas("¿Qué es una colección de datos relacionados?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es un sistema de base de datos?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los tipos de Bases de datos?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el universo de discurso?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué actores existen para una base de datos? Explicar brevemente cada uno", objArea));
        listaPreguntas.add(new Preguntas("Diferencia entre Modelo Entidad-Relación y Modelo EER", objArea));
        listaPreguntas.add(new Preguntas("Mencionar todos los tipos de atributos, explicar brevemente cada uno e indicar el símbolo que lo representa.", objArea));
        listaPreguntas.add(new Preguntas("Diferencia entre grado de participación, grado de cardinalidad y grado de la relación", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la diferencia entre un entramado y una especialización?", objArea));
        listaPreguntas.add(new Preguntas("Indicar 3 formas de representar una especialización (disyunción, solapamiento) en un diagrama Relacional", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la diferencia entre las propiedades ACID y BASE NO RELACIONAL?", objArea));
        listaPreguntas.add(new Preguntas("¿Para qué utilizamos ETL?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es una entidad débil?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la diferencia entre un diagrama relacional y una entidad-relación?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es normalización?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la diferencia entre dependencia funcional y dependencia transitiva?", objArea));
        listaPreguntas.add(new Preguntas("Explique la diferencia (Join y un select anidado normal):", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la diferencia entre DDL y DML?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es la finalidad de normalizar una BD?", objArea));
        listaPreguntas.add(new Preguntas("Explique cada forma normal incluyendo Boyce Codd", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es business intelligence?", objArea));
        listaPreguntas.add(new Preguntas("Nombre las tecnologías BI", objArea));
        listaPreguntas.add(new Preguntas("¿De qué se trata Business Analytics?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es Big Data?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los beneficios de un sistema BI?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuándo se debe usar BI?", objArea));
        listaPreguntas.add(new Preguntas("Explique el hype cycle de Gartner", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es Data Warehouse?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las características del DW?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el Data warehousing?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el Data Marts?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué son los Operational Data Store (ODS)?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el Staging Area?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo es el proceso ETL?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los elementos de un DW?", objArea));
        listaPreguntas.add(new Preguntas("Mencione los tipos de esquemas de los DW", objArea));
        listaPreguntas.add(new Preguntas("Mencione las métricas del DW (Leading, Lagging, KPI, KGI)", objArea));

        objArea=4;//Infraestructura y seguridad
        //listaPreguntas.add(new Preguntas("", objArea)); 
        listaPreguntas.add(new Preguntas("¿Cuáles son las amenazas más frecuentes para un sistema (organizaciones)?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son las amenazas más frecuentes para un sistema (ataques)?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es preocuparse por la seguridad de la información?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es un riesgo?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es el riesgo en seguridad de la información?", objArea));
        listaPreguntas.add(new Preguntas("¿Cómo se pueden identificar los riesgos?", objArea));
        listaPreguntas.add(new Preguntas("¿Qué es importante durante el análisis de riesgos?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuáles son los principios de gestión de riesgos?", objArea));
        listaPreguntas.add(new Preguntas("¿Cuál es el proceso de la gestión de riesgos?", objArea));

        
        return listaPreguntas;
    }
    
    public String ObtenerLista(ArrayList<Preguntas> preguntas){
        String stPreguntas="";
        for (int i = 0; i < preguntas.size(); i++) {
            stPreguntas=stPreguntas+(i+1)+".- "+preguntas.get(i).getDesarrollo()+ "\n";
        }
        return stPreguntas;
    }
    
    public String ElegirPreguntas(ArrayList<Preguntas> preguntas){
        String eleccion="";
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, preguntas.size());
            eleccion=eleccion+(i+1)+".- "+preguntas.get(numeroAleatorio).getDesarrollo()+"\n";
        }
        return eleccion;
    }
    
    public String ElegirPreguntasSinRepeit(ArrayList<Preguntas> preguntas){
        String eleccion="";
        ArrayList<Preguntas> preguntasElegidas=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, preguntas.size());
            Preguntas question=preguntas.get(numeroAleatorio);
            if(!preguntasElegidas.contains(question)){
                preguntasElegidas.add(question);
            }else{
                i--;
            }
        }
        eleccion=ObtenerLista(preguntasElegidas);
        return eleccion;
    }
    
    public String ElegirPreguntasSinRepeitArea(ArrayList<Preguntas> preguntas, int area){
        String eleccion="";
        ArrayList<Preguntas> preguntasElegidas=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, preguntas.size());
            Preguntas question=preguntas.get(numeroAleatorio);
            if(!preguntasElegidas.contains(question) && question.getObjArea()==area){
                preguntasElegidas.add(question);
            }else{
                i--;
            }
        }
        eleccion=ObtenerLista(preguntasElegidas);
        return eleccion;
    }
}
