/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;

import Modulos.Problema;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author dayan
 */
public class CargaProblemas {
    
    private ArrayList<Problema> listaProblemas;
    
    public ArrayList<Problema> cargaArrayProblemas(){
        listaProblemas=new ArrayList<>();
        int objArea=1;//Ingeniería de sistemas
        objArea=2;//Programación
        listaProblemas.add(new Problema(1, "Aplicando diseño orientado a objetos, realizar el diagrama de clases para modelar un sistema que la información empleada por un concesionario de automóviles, teniendo en cuenta los siguientes aspectos:\n" +
"A un concesionario de coches llegan clientes para comprar automóviles.\n" +
"De cada vehículo interesa saber la matrícula, modelo, marca y color.\n" +
"Un cliente puede comprar varios vehículos en el concesionario.\n" +
"Cuando un cliente compra un auto, se le hace una ficha en el concesionario con la siguiente información: CI, nombre, apellidos, dirección y teléfono.\n" +
"Los vehículos que el concesionario vende pueden ser nuevos o usados (de segunda mano). De los autos nuevos interesa saber el número de unidades que hay en el concesionario. De los autos viejos interesa saber el número de kilómetros que lleva recorrido.\n" +
"El concesionario también dispone de un taller en el que los mecánicos reparan los vehículos que llevan los clientes. Un mecánico repara varios autos a lo largo del día, y un vehículo puede ser reparado por varios mecánicos.	 \n" +
"Los mecánicos tienen un CI, nombre, apellidos, fecha de contratación y salario. Se desea guardar también la fecha en la que se repara cada vehículo, los repuestos cambiados o requeridos y el número de horas que se ha tardado en arreglar cada automóvil", objArea));
        listaProblemas.add(new Problema(2, "La empresa de transporte “El Dinqui”, que presta servicio de transporte de personas, quiere poner a disposición de sus pasajeros, una aplicación móvil que les permita solicitar transporte desde su ubicación, de manera que los vehículos de la empresa que se encuentren cerca, puedan atender a dicha solicitud y recoger al pasajero que solicitó transporte. Por otro lado, la plataforma debe poder registrar a los conductores que prestarán el servicio, por lo que ellos deberán apersonarse a las oficinas de la empresa, donde el personal administrativo procederá con la verificación de la documentación del conductor, para luego ser registrados en el sistema donde se les dará unas credenciales de ingreso para hacer uso de la aplicación, y así poder atender a las solicitudes de transporte de los pasajeros. Asimismo, los pasajeros, para hacer uso de la aplicación deberán registrarse desde la misma.\n" +
"Cuando el conductor atienda la solicitud, se notificará al pasajero que su solicitud fue atendida y este podrá ver en tiempo real la ubicación del conductor para ver por cómo se aproxima a la ubicación del pasajero. Cuando el conductor recoja al pasajero, este indicará en la aplicación que el viaje ha iniciado y se seguirá monitoreando el recorrido.\n" +
"Una vez finalizado el viaje, el conductor marcará en la aplicación que el viaje ha finalizado y el pasajero recibirá una notificación para que pueda dar una puntuación al viaje y también reportar incidentes como accidentes, malas atenciones, objetos olvidados, etc. Estos reportes de incidentes deberán ser atendidos por el personal administrativo de la empresa, donde se podrá realizar un intercambio de mensajes entre el personal de la empresa y el pasajero con el fin de dar solución al incidente. En algún punto, dichos incidentes podrán marcarse como resueltos ya sea por autorización del pasajero o por qué ha pasado un tiempo sin el que pasajero dé una respuesta.", objArea));
        listaProblemas.add(new Problema(3, "Se desea un sistema que permita manipular la información sobre los préstamos de las películas de un vídeo club. En la actualidad la gestión de esta información se lleva cabo del siguiente modo:\n" +
"Cuando se hace un préstamo se rellena una ficha en la que se anota el socio que se lleva la película, la fecha y el número de la cinta que se lleva, que es único (de cada película hay varias copias en cintas distintas). Esta ficha se deposita en el archivador de películas prestadas. Cuando el socio devuelve la cinta, la ficha se pasa al archivador de películas devueltas. El vídeo club tiene, además, un archivador con fichas de películas ordenadas por título; cada ficha tiene además el género de la película (comedia, terror, ...), su director y los nombres de los actores que intervienen. También se tiene un archivador con las fichas de los socios, ordenadas por el código que el vídeo club les da cuando les hace el carné; cada ficha tiene el nombre del socio, su dirección y teléfono, los nombres de sus directores favoritos, los nombres de sus actores favoritos y los géneros cinematográficos de su preferencia. Cuando un socio quiere tomar prestada una película de la que no hay copias disponibles, se le puede anotar en la lista de espera de esa película. Cada vez que se devuelve una película, se comprueba si hay alguien en su lista de espera, y si es así se llama por teléfono al primer socio de la lista para decirle que ya puede pasar a recogerla, borrándolo después de la lista.", objArea));
        listaProblemas.add(new Problema(4, "Se desea crear una aplicación para el diseño de Avatares. Se denomina Avatar a una representación gráfica asociada a un usuario dentro de una plataforma digital.\n" +
"La aplicación debe permitir al usuario construir su avatar a partir de un cuerpo vacío como el de la siguiente figura:\n" +
"El avatar puede ser personalizado por un gran conjunto de accesorios que pueden ser aplicados en distintas partes del cuerpo, como, por ejemplo: estilos de ojos, accesorios para los ojos (como anteojos, parches, etc.), estilos de peinado, accesorios para la cabeza (como sombreros, etc.), estilos de nariz, estilos de boca, bello facial, estilos de orejas, estilo de ropa (parte superior e inferior) y así sucesivamente, con el objetivo de poder personalizar todo el cuerpo del avatar.\n" +
"Estos avatares pueden ser publicados dentro de la aplicación para que los usuarios de la misma puedan visualizarlos. \n" +
"La aplicación debe proveer una opción que permita al usuario visualizar las creaciones de los otros usuarios de la plataforma y así poder crear un avatar a partir de otro avatar ya creado, ya sea por el mismo usuario o por otro que lo haya publicado en la plataforma, de manera que no siempre se construya un avatar desde cero y el usuario pueda agregar sus personalizaciones sobre un avatar ya existente. Tomar en cuenta que los cambios realizados en este caso no deben afectar al avatar original.\n" +
"", objArea));
        //listaProblemas.add(new Problema(1, "", objArea));
        //objArea=3;//Infraestructura y seguridad
        //objArea=4;//base de datos
        return listaProblemas;
    }
    
    public String ObtenerLista(ArrayList<Problema> problema){
        String stProblemas="";
        for (int i = 0; i < problema.size(); i++) {
            stProblemas=stProblemas+problema.get(i).getId()+".- "+problema.get(i).getDesarrollo()+ "\n";
        }
        return stProblemas;
    }
    
    public String ElegirProblema(ArrayList<Problema> problemas){
        String eleccion="";
        int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, problemas.size());
        eleccion=eleccion+problemas.get(numeroAleatorio).getId()+".- "+problemas.get(numeroAleatorio).getDesarrollo()+"\n";
        return eleccion;
    }
    
    public String ElegirProblema(ArrayList<Problema> problemas, int objArea){
        String eleccion="";
        ArrayList<Problema> listaProblemas2=obtenerProblemaArea(problemas, objArea);
        if(listaProblemas2!=null){
            int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, listaProblemas2.size());
            eleccion=eleccion+listaProblemas2.get(numeroAleatorio).getId()+".- "+listaProblemas2.get(numeroAleatorio).getDesarrollo()+"\n";
        }else{
            System.out.println("Aún no hay problemas de esa área");
        }
        
        return eleccion;
    }
    
    public ArrayList<Problema> obtenerProblemaArea(ArrayList<Problema> problema, int Area){
         ArrayList<Problema> listaProblemas2=new ArrayList<>();
         for (int i = 0; i < problema.size(); i++) {
            if(problema.get(i).getObjArea()==Area){
                listaProblemas2.add(problema.get(i));
            }
        }
        if (listaProblemas2!=null){
            return listaProblemas2;
        }
        return null;
    }
}
