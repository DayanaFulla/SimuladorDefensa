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
        listaProblemas.add(new Problema("En una compañía distribuidora de agua colapsa de la torre de distribución de agua\n" +
        "principal que se encontraba junto a las oficinas y vertió 150,000 litros de agua sobre las\n" +
        "mismas, ese evento, destruyó el techo de la infraestructura por donde ingreso agua a\n" +
        "todos los ambientes inutilizando los computadores y toda la documentación. El día\n" +
        "anterior, el administrador y el encargado de sistemas son internados en terapia intensiva\n" +
        "con covit-19.\n" +
        "En este panorama, la asamblea de socios convocada de emergencia, dio las siguientes\n" +
        "líneas de acción a la gerencia de la empresa:\n" +
        "1. Se le proporciona recursos extraordinarios en efectivo para que pueda encarar a\n" +
        "emergencia en la readecuación de las oficinas.\n" +
        "2. Se le otorga nuevos documentos notariados (PODERES) para que no tenga\n" +
        "dificultades en la administración de la empresa y pueda representarla en todo\n" +
        "ámbito público y privado.\n" +
        "3. Se le autoriza tercialisar la reconstrucción de las oficinas, sistemas y adquisición\n" +
        "de equipos si fuera necesario.\n" +
        "4. Reorganizar los departamentos Administrativos, Facturación y Cobranza,\n" +
        "Planificación, Mantenimiento y Expansión.\n" +
        "5. Implantar nuevos sistemas computarizados tanto en equipos como en programas\n" +
        "de computación, garantizando que colapsos como el ocurrido no generen perdida\n" +
        "de información y la empresa pueda seguir operativamente funcional.\n" +
        "Para implantar el punto cinco, con extrema urgencia se requiere, censar e identificar a\n" +
        "todos los socios conectados a la red, cuantificar e identificar todos los ductos de\n" +
        "suministro de agua, llevar un estricto control de las cuentas por pagar y por cobrar,\n" +
        "identificar los bienes que cuenta la empresa así como su control y mantenimiento,\n" +
        "también el registro y control de todo lo relacionado a los recursos humanos y\n" +
        "fundamentalmente conocer los indicadores económicos y financieros necesario para la\n" +
        "toma de decisiones, todos ellos son enumeraciones con carácter informativo y no\n" +
        "limitativo a los sistemas de información que se necesitan.\n" +
        "Con la información proporcionada mejore o corrija si corresponde y realice los ajustes\n" +
        "necesarios para cumplir con las expectativas del caso para poder realizar lo siguiente:\n" +
        "1. Recuperar la información de la empresa.\n" +
        "2. Determinar la metodología para la elaboración de los productos de\n" +
        "software y justificar su decisión. \n" +
        "EXAMEN DE GRADO INGENIERÍA DE SOFTWARE [MODELO 1]\n" +
        "3. Explique y elaborar un modelo de negocio de la Empresa\n" +
        "4. Explique y elaborar Modelo de Dominio\n" +
        "5. Determinar los requerimientos de software.\n" +
        "6. Determine el alcance (lista de opciones) de cada modulo\n" +
        "7. Explique y elaborar Diagrama de Casos de Uso\n" +
        "8. Priorizar la elaboración de los diferentes productos de software\n" +
        "9. Determinar las métricas para evaluar el producto de software\n" +
        "10.Determinar el tiempo de desarrollo de los productos de Software.\n" +
        "11.Determine el Costo de desarrollo de los productos de Software.", objArea));
        
        listaProblemas.add(new Problema("El Hotel Palace *****, decide aumentar una estrella en su calificación para ello necesita\n" +
"realizar ajustes tanto en su infraestructura como en sus sistemas informáticos.\n" +
"El estado actual del Hotel es el siguiente:\n" +
"Esta ubicado en una isla (el hotel es toda la isla) dentro de las 200 millas náuticas de la\n" +
"costa, el acceso al hotel es vía ferri por cuenta del hotel con 4 viajes regulares todos los\n" +
"días en intervalos de 6 horas, votes y/o helicópteros particulares. El hotel cuenta con 25 oficinas de turismo propia en el continente a cargo de un gerente\n" +
"que gestiona las reservas y realizan sus labores o sincronizan sus actividades vía\n" +
"telefonía fija. Los servicio básicos (agua, luz y radio comunicaciones) son propios del hotel; no hay\n" +
"otros servicios por lo que en caso de requerirlos el hotel se los debe autogestionar.\n" +
"Cuenta con 100 habitaciones simples, 50 dobles, 30 triples y 20 múltiples en la modalidad\n" +
"normal y la mitad de cada una en la modalidad suite.\n" +
"Tiene áreas de piscina, sauna, gimnasio, cafetería (3), restaurante (3), bar discoteca(2),\n" +
"lavandería, mensajería y transporte.\n" +
"También existen las áreas de Administración, contabilidad, almacenes, cocina.\n" +
"El sistema informático de Registro y Reserva (que se accede solo desde recepción) tiene\n" +
"las siguientes características: Control sobre la reserva de habitación, aplicación de\n" +
"reserva, salida anticipada, cambio de habitación, cambio de reserva, cancelación de\n" +
"reserva, cantidad de huéspedes, programación de recojo y traslado del aeropuerto desde\n" +
"y hasta la isla, servicio a la habitación, servicios de cafetería, servicio de restaurant,\n" +
"servicio de lavandería, servicio de mensajería.\n" +
"El acceso a las habitaciones es mediante una tarjeta magnética programable en\n" +
"recepción, los costos de los servicios son cargado a la habitación, un huésped puede\n" +
"reservar varias habitaciones, la capacidad de las habitaciones es dada por las camas\n" +
"disponibles que puede ser simple, matrimonial doble, triple y múltiple hasta 7 camas, en\n" +
"las versiones normal y suite.\n" +
"Los nuevos requerimientos son los siguientes: - Automatización e integración de todos los servicios\n" +
"- Acceso a reserva en línea (www)\n" +
"- Se mantienen los servicios anteriores y se amplía los huéspedes VIP con\n" +
"disponibilidad de habitaciones iguales a las suite. - En cualquier momento, el huésped podrá definir el estado de confort de la\n" +
"habitación (temperatura, humedad, iluminación, disponibilidad del frigo bar, etc.)\n" +
"- Se debe incorporar el registro biométrico para el acceso al hotel y las diferentes\n" +
"áreas de la infraestructura incluyendo el registro facial. - Para los clientes VIP, no será necesario que el huésped se aproxime por recepción\n" +
"cuando llegue al hotel si su registro biométrico ya fue realizado y tampoco al\n" +
"concluir su reserva, en cuyo caso sus cargos serán directamente cargado a su\n" +
"tarjeta y su consumo reportado por correo electrónico. - Al detectarse el ingreso del huésped al hotel, automáticamente se debe\n" +
"acondicionar la habitación a su confort. - Después de abandonar por 30 minutos el Hotel en forma automática deberá\n" +
"realizarse las operaciones de mantenimiento de la habitación si no fue realizada\n" +
"con anterioridad. - Según la época y el tipo de cliente, existirán promociones con servicios gratuitos\n" +
"Con la información recopilada mejore o corrija si corresponde y realice lo siguiente:\n" +
"1. Determinar la metodología para la elaboración de los productos de\n" +
"software y justificar su decisión. 2. Explique y elaborar un modelo de negocio de la Empresa\n" +
"3. Explique y elaborar Modelo de Dominio\n" +
"4. Determinar los requerimientos de software.\n" +
"5. Determine el alcance (lista de opciones) de cada modulo\n" +
"6. Explique y elaborar Diagrama de Casos de Uso\n" +
"7. Priorizar la elaboración de los diferentes productos de software\n" +
"8. Determinar las métricas para evaluar el producto de software\n" +
"9. Determinar el tiempo de desarrollo de los productos de Software.\n" +
"10.Determine el Costo de desarrollo de los productos de Software.", objArea));
        listaProblemas.add(new Problema("La empresa “Catering Mundial” (CM) presta servicios en de alimentación a los\n" +
"continentes Americanos, Europeo y Africano, actualmente tiene a su cargo 25\n" +
"campamentos petroleros distribuidos en los 3 continentes los que se encuentran\n" +
"en el mar, el desierto, en zonas boscosas y periurbanas.\n" +
"CM se encarga de elaborar el menú para las 6 jornadas de alimentación diarias, las\n" +
"que dependen del horario y los turnos de cada campamento. En cada turno se sirve\n" +
"bufet variado y equilibrado en cuanto a las kilocalorías, carbohidratos y vitaminas.\n" +
"Los alimentos con que se elaboran las distintas recetas deben estar carentes de\n" +
"preservantes, es decir, productos no enlatados.\n" +
"Se efectúa un estricto control de calidad a la adquisición de los suministros que es\n" +
"realizada en preferencia en los puestos de acopio masivos con lo que se trata de\n" +
"evitar el manipuleo de estos por lo que no se tiene un proveedor exclusivo.\n" +
"La empresa en todas las ciudades donde presta servicio tiene oficinas\n" +
"acondicionadas para la recepción, fraccionamiento, porcionamiento, empaquetado\n" +
"y almacenado de los suministros en contenedores de diferentes capacidades.\n" +
"Las adquisiciones siempre son realizadas según la demanda estimada de a cuerdo a\n" +
"la dosificación de los menús que son preparados mensualmente, el sistema debe\n" +
"indicar las cantidades a ser adquiridas de cada componente de las recetas y efectuar\n" +
"las correcciones necesarias después de efectuado los descartes y fraccionamientos.\n" +
"La preparación de los alimentos siempre es realizada en el lugar donde los mismos\n" +
"van a ser consumidos según las recetas y menús indicados por la empresa, por lo\n" +
"que se requiere se lleve un control estricto de toda la cadena de frio desde que los\n" +
"suministros son fraccionados empaquetados, almacenados en los depósitos\n" +
"centrales y trasladados hasta el lugar donde van a ser preparados, incluyendo los\n" +
"depósitos y tiempos almacenaje en los depósitos de los lugares de expendio y de\n" +
"los almacenes centrales.\n" +
"Cada campamento dispone de todos los utensilios y contenedores necesarios,\n" +
"debidamente acondicionados para preservar y contener insumos por un mes, la\n" +
"reposición de insumos se la efectuá cada 15 días.\n" +
"Para efectuar un seguimiento y control de todo el proceso, se requiere se determine\n" +
"el costo, tiempo y alcance de un producto de software orientado a cumplir con la \n" +
"explicación antes mencionado y permitir la implementación de controles\n" +
"específicos en cada proceso desde el Stock, dotación de Insumo para cocina, control\n" +
"al menú elaborado y realizado, control de consumo de los alimentos no solo en peso\n" +
"sino también en kilocalorías, carbohidratos legumbres y vitaminas, así como\n" +
"también los niveles de hidratación del personal y la incidencia de las condiciones\n" +
"atmosféricas en la ingesta de los alimentos, el sistema deberá alertar cuando las\n" +
"condiciones medioambientales así lo ameriten, el cambio en las recetas por otras\n" +
"equivalentes en cuanto a sus propiedades nutricionales, además de indicar si el\n" +
"consumo de los alimentos es el adecuado en cantidad, peso y propiedades\n" +
"nutricionales según la cantidad de comensales.\n" +
"Con la información recopilada mejore o corrija si corresponde y realice lo siguiente:\n" +
"1. Determinar la metodología para la elaboración de los productos de\n" +
"software y justificar su decisión.\n" +
"2. Explique y elaborar un modelo de negocio de la Empresa\n" +
"3. Explique y elaborar Modelo de Dominio\n" +
"4. Determinar los requerimientos de software.\n" +
"5. Determine el alcance (lista de opciones) de cada modulo\n" +
"6. Explique y elaborar Diagrama de Casos de Uso\n" +
"7. Priorizar la elaboración de los diferentes productos de software\n" +
"8. Determinar las métricas para evaluar el producto de software\n" +
"9. Determinar el tiempo de desarrollo de los productos de Software.\n" +
"10.Determine el Costo de desarrollo de los productos de Software.", objArea));
        listaProblemas.add(new Problema("Una empresa dedicada al ensamblaje de electrodomésticos, incremento en más del 10,000% las demandas de sus productos por lo que ahora requiere pasar de ser una empresa unipersonal a una empresa de Responsabilidad Limitada y la computarización de sus registros es necesaria; sus procesos son los siguientes:\n" +
"·        Tiene la representación de productos de Brasil, Argentina, México y China.\n" +
"·        Los embalajes de los productos, los adquiere por separado de La Paz.\n" +
"·        La impresión de etiquetas, logos y demás artes las realiza en la ciudad en diferentes imprentas.\n" +
"·        Los pernos, tornillos, tuercas y arandelas de ajuste para los diferentes productos los adquiere exclusivamente del Brasil.\n" +
"·        Los almacenes tienen diferentes áreas para almacenar los productos según sus características y espacio suficiente para partes de 40,000 productos.\n" +
"·        Tienen 2 montacargas y 1 grúa pequeña, 3 ayudantes, 2 encargados de depósito y 1 jefe de Almacenes.\n" +
"·        El área de producción tiene al Jefe de Producción y un equipo de 6 ensambladores.\n" +
"·        El área de distribución tiene espacio para almacenar 5, 000 productos terminados y una área de exhibición para 25 productos diferentes.\n" +
"·        Tiene un camión de distribución y 2 camionetas medianas, 6 choferes, 9 ayudantes, 1 jefe de transporte y 1 jefe de distribución.\n" +
"·        El área de ventas cuenta con 3 ventanillas de atención al público, 6 vendedores, un Centro de llamadas con 3 encargados, un encargado de sistemas  y un jefe de ventas.\n" +
"·        Las ventas de los productos según un estudio realizado tiene un potencial del 85% a ser realizada vía internet y solo 15% en ventanillas.\n" +
"·        El área de compras tiene al jefe de compras y 3 encargados de compras\n" +
"·        Las empresas de importación no son exclusivas y trabajan según ofertás.\n" +
"·        El resto del área administrativa está compuesta por el Gerente, el Administrador, el Contador y 2 auxiliares, el encargado de Activos y el Encargado de Personal\n" +
"\n" +
"Para el futuro inmediato, tienen presupuestado adquirir 4 locales de Distribución a ser ubicadas en puntos estratégicos según las áreas de entrega de mayor demanda a ser determinada de los datos estadísticos de las ventas.\n" +
"Los lugares de distribución contaran con 2 camionetas, 2 choferes, 4 ayudantes y el encargado del local que además será el encargado del depósito; inicialmente no está previsto poner puntos de venta en esos depósitos.\n" +
"En este panorama, además en forma prioritaria se requiere lo siguiente:\n" +
"Es de extrema necesidad para la empresa, llevar el control de todo el proceso de ensamblaje y en segundo lugar el sistema contable, luego de estos 2 sistemas se requiere computarizar el resto de las áreas, adquirir los equipos de computación y armar las redes de información necesaria.\n" +
"Para este objetivo deberá realizar:\n" +
"\n" +
"1.     Elabore y explique el MODELO DE NEGOCIO de la Empresa\n" +
"2.     Elabore y explique el MODELO DE DOMINIO de la Empresa\n" +
"3.     Determinar los requerimientos FUNCIONALES para la instalación de software.\n" +
"4.     Determinar los requerimientos NO FUNCIONALES para la instalación de software.\n" +
"5.     Determine el alcance (lista de opciones) de cada modulo\n" +
"6.     Explique y elaborar Diagrama de Casos de Uso\n" +
"7.     Priorizar la elaboración de los diferentes productos de software\n" +
"8.     Determinar las métricas para evaluar el producto de software\n" +
"9.     Determinar el tiempo de desarrollo de los productos de Software.\n" +
"10.   Determine el Costo de desarrollo de los productos de Software.", objArea));
        objArea=2;//Programación
        listaProblemas.add(new Problema("Aplicando diseño orientado a objetos, realizar el diagrama de clases para modelar un sistema que la información empleada por un concesionario de automóviles, teniendo en cuenta los siguientes aspectos:\n" +
"A un concesionario de coches llegan clientes para comprar automóviles.\n" +
"De cada vehículo interesa saber la matrícula, modelo, marca y color.\n" +
"Un cliente puede comprar varios vehículos en el concesionario.\n" +
"Cuando un cliente compra un auto, se le hace una ficha en el concesionario con la siguiente información: CI, nombre, apellidos, dirección y teléfono.\n" +
"Los vehículos que el concesionario vende pueden ser nuevos o usados (de segunda mano). De los autos nuevos interesa saber el número de unidades que hay en el concesionario. De los autos viejos interesa saber el número de kilómetros que lleva recorrido.\n" +
"El concesionario también dispone de un taller en el que los mecánicos reparan los vehículos que llevan los clientes. Un mecánico repara varios autos a lo largo del día, y un vehículo puede ser reparado por varios mecánicos.	 \n" +
"Los mecánicos tienen un CI, nombre, apellidos, fecha de contratación y salario. Se desea guardar también la fecha en la que se repara cada vehículo, los repuestos cambiados o requeridos y el número de horas que se ha tardado en arreglar cada automóvil", objArea));
        listaProblemas.add(new Problema("La empresa de transporte “El Dinqui”, que presta servicio de transporte de personas, quiere poner a disposición de sus pasajeros, una aplicación móvil que les permita solicitar transporte desde su ubicación, de manera que los vehículos de la empresa que se encuentren cerca, puedan atender a dicha solicitud y recoger al pasajero que solicitó transporte. Por otro lado, la plataforma debe poder registrar a los conductores que prestarán el servicio, por lo que ellos deberán apersonarse a las oficinas de la empresa, donde el personal administrativo procederá con la verificación de la documentación del conductor, para luego ser registrados en el sistema donde se les dará unas credenciales de ingreso para hacer uso de la aplicación, y así poder atender a las solicitudes de transporte de los pasajeros. Asimismo, los pasajeros, para hacer uso de la aplicación deberán registrarse desde la misma.\n" +
"Cuando el conductor atienda la solicitud, se notificará al pasajero que su solicitud fue atendida y este podrá ver en tiempo real la ubicación del conductor para ver por cómo se aproxima a la ubicación del pasajero. Cuando el conductor recoja al pasajero, este indicará en la aplicación que el viaje ha iniciado y se seguirá monitoreando el recorrido.\n" +
"Una vez finalizado el viaje, el conductor marcará en la aplicación que el viaje ha finalizado y el pasajero recibirá una notificación para que pueda dar una puntuación al viaje y también reportar incidentes como accidentes, malas atenciones, objetos olvidados, etc. Estos reportes de incidentes deberán ser atendidos por el personal administrativo de la empresa, donde se podrá realizar un intercambio de mensajes entre el personal de la empresa y el pasajero con el fin de dar solución al incidente. En algún punto, dichos incidentes podrán marcarse como resueltos ya sea por autorización del pasajero o por qué ha pasado un tiempo sin el que pasajero dé una respuesta.", objArea));
        listaProblemas.add(new Problema("Se desea un sistema que permita manipular la información sobre los préstamos de las películas de un vídeo club. En la actualidad la gestión de esta información se lleva cabo del siguiente modo:\n" +
"Cuando se hace un préstamo se rellena una ficha en la que se anota el socio que se lleva la película, la fecha y el número de la cinta que se lleva, que es único (de cada película hay varias copias en cintas distintas). Esta ficha se deposita en el archivador de películas prestadas. Cuando el socio devuelve la cinta, la ficha se pasa al archivador de películas devueltas. El vídeo club tiene, además, un archivador con fichas de películas ordenadas por título; cada ficha tiene además el género de la película (comedia, terror, ...), su director y los nombres de los actores que intervienen. También se tiene un archivador con las fichas de los socios, ordenadas por el código que el vídeo club les da cuando les hace el carné; cada ficha tiene el nombre del socio, su dirección y teléfono, los nombres de sus directores favoritos, los nombres de sus actores favoritos y los géneros cinematográficos de su preferencia. Cuando un socio quiere tomar prestada una película de la que no hay copias disponibles, se le puede anotar en la lista de espera de esa película. Cada vez que se devuelve una película, se comprueba si hay alguien en su lista de espera, y si es así se llama por teléfono al primer socio de la lista para decirle que ya puede pasar a recogerla, borrándolo después de la lista.", objArea));
        listaProblemas.add(new Problema("Se desea crear una aplicación para el diseño de Avatares. Se denomina Avatar a una representación gráfica asociada a un usuario dentro de una plataforma digital.\n" +
"La aplicación debe permitir al usuario construir su avatar a partir de un cuerpo vacío como el de la siguiente figura:\n" +
"El avatar puede ser personalizado por un gran conjunto de accesorios que pueden ser aplicados en distintas partes del cuerpo, como, por ejemplo: estilos de ojos, accesorios para los ojos (como anteojos, parches, etc.), estilos de peinado, accesorios para la cabeza (como sombreros, etc.), estilos de nariz, estilos de boca, bello facial, estilos de orejas, estilo de ropa (parte superior e inferior) y así sucesivamente, con el objetivo de poder personalizar todo el cuerpo del avatar.\n" +
"Estos avatares pueden ser publicados dentro de la aplicación para que los usuarios de la misma puedan visualizarlos. \n" +
"La aplicación debe proveer una opción que permita al usuario visualizar las creaciones de los otros usuarios de la plataforma y así poder crear un avatar a partir de otro avatar ya creado, ya sea por el mismo usuario o por otro que lo haya publicado en la plataforma, de manera que no siempre se construya un avatar desde cero y el usuario pueda agregar sus personalizaciones sobre un avatar ya existente. Tomar en cuenta que los cambios realizados en este caso no deben afectar al avatar original.\n" +
"", objArea));
        //listaProblemas.add(new Problema("", objArea));
        objArea=3;//base de datos
        listaProblemas.add(new Problema("Obtener el diagrama E/R para un sistema de control de vuelos adaptado a las siguientes reglas de gestión (indicar las entidades, interrelaciones, etc., que se deducen de cada una de las reglas): \n" +
"De cada aeropuerto se conoce su código, nombre, ciudad y país. \n" +
"En cada aeropuerto pueden tomar tierra diversos modelos de aviones (el modelo de un avión determina su capacidad, es decir, el número de plazas. \n" +
"En cada aeropuerto existe una colección de programas de vuelo. En cada programa de vuelo se indica el número de vuelo, línea aérea y días de la semana en que existe dicho vuelo. \n" +
"Cada programa de vuelo despega de un aeropuerto y aterriza en otro. \n" +
"Los números de vuelo son únicos para todo el mundo. \n" +
"En cada aeropuerto hay múltiples aterrizajes y despegues. Todos los aeropuertos contemplados están en activo, es decir, tienen algún aterrizaje y algún despegue. \n" +
"Cada vuelo realizado pertenece a un cierto programa de vuelo. Para cada vuelo se quiere conocer su fecha, plazas vacías y el modelo de avión utilizado. \n" +
"Algunos programas de vuelo incorporan escalas técnicas intermedias entre los aeropuertos de salida y de llegada. Se entiende por escala técnica a un aterrizaje y despegue consecutivos sin altas o bajas de pasajeros. \n" +
"De cada vuelo se quieren conocer las escalas técnicas ordenadas asignándole a cada una un número de orden. \n" +
"Por ejemplo, el programa de vuelo 555 de Iberia con vuelos los lunes y jueves despega de Barajas-Madrid-España y aterriza en Caudell-Sydney-Australia teniendo las siguientes escalas técnicas: 1- Los Pradiños-Sao Paulo-Brasil, 2-El Emperador-Santiago-Chile y 3-Saint Kitts-Auckland-Nueva Zelanda.\n" +
" Realizar el mapeo del esquema ER de la pregunta anterior\n" +
"Diseñar una consulta que obtenga todos los vuelos que partieron de algún aeropuerto que se encuentre en Brasil\n" +
"Realizar la consulta anterior en álgebra relacional\n" +
"Diseñar una consulta que el total de vuelos realizados por modelo de avión\n" +
"Indicar en qué forma normal se encuentra la base de datos, justifique su respuesta", objArea));
        
        listaProblemas.add(new Problema(" https://drive.google.com/file/d/16w6J-KVWzatPui56cWS6Bai5YN5Evdxi/view?usp=sharing "
                + "1)Realizar el mapeo del esquema ER que está diseñado para que las autoridades  \n" +
"marítimas puedan hacer el seguimiento de los buques mercantes y sus ubicaciones.  Especificando todas las claves principales y claves foráneas. \n" +
"2) Realizar la estructura de la base de datos mapeada en SQL, junto a la asignacion de  claves principales y foraneas. \n" +
"3) Registrar un Estado/País, Puerto y Barco para demostrar la correcta restricción de las  llaves de la base de datos \n" +
"4) Si eliminamos la llave foránea de una tabla, ¿se eliminarán los datos de la tabla  \n" +
"referenciada?", objArea));
        
        listaProblemas.add(new Problema("En el gimnasio “Siempre en forma” se quiere implantar una base de datos para llevar el control de los socios, recursos utilizados, etc. Las especificaciones que nos han dado son las siguientes:\n" +
"Existen varias salas, de las cuales se quiere guardar información como, los metros cuadrados que ocupa, ubicación y el tipo de sala (cardio, general, muscular). Cada sala se identifica por un número de sala.\n" +
"Hay salas que tienen aparatos y salas que no. En las salas se pueden o no impartir clases.\n" +
"De cada aparato se quiere tener almacenado su código, descripción y estado de conservación. Cada aparato está asignado a una única sala.\n" +
"También se quiere mantener información relacionada con las clases que se imparten (descripción y día/hora en la que se imparten); cada clase se identifica por un código de clase. Cada clase tiene asignada una sala y es impartida por un sólo monitor o instructor.\n" +
"De cada monitor se quiere conocer el CI, nombre, teléfono, si tienen o no titulación, experiencia profesional, así como las clases que pueden impartir (preparación como monitor de aerobic, step, streching, etc).\n" +
"De cada socio se quiere conocer el número de socio, nombre, dirección, teléfonos, profesión y datos bancarios, así como las clases a las que asiste.\n" +
"El gimnasio dispone también de pistas de squash, de las que se quiere conocer el número de pista, ubicación y estado. Las pistas de squash pueden ser utilizadas por socios para lo que proporciona un servicio de reservas de pistas (en una fecha y a una hora.)\n" +
"En el gimnasio “siempre en forma” impone las siguientes restricciones:\n" +
"Las pistas de Squash se consideran salas y se desea conocer también su tamaño y ubicación.\n" +
"Las clases sólo se imparten en salas sin aparatos. Las salas con aparatos siguen clasificándose en sala de cardio, general, etc.\n" +
"\n" +
"a) Identifique las entidades y los atributos correspondientes a cada una de las entidades, indicando explícitamente cuáles serán las claves primarias de las distintas entidades.\n" +
"b) Analice las relaciones existentes entre las distintas entidades y determine su cardinalidad.\n" +
"c) Dibuje un diagrama entidad-relación o entidad-relación mejorado, que represente el modelo de datos definido por las entidades y las relaciones identificadas en los apartados anteriores.\n" +
"d) A partir del diagrama, obtenga el conjunto de tablas que nos permita implementar nuestro modelo en un sistema gestor de bases de datos relacionales, indicando las claves primarias de todas y cada una de las tablas de nuestra base de datos.\n" +
"e) Indicar en qué forma normal se encuentra el conjunto de tablas obtenidas, y cómo se podría llegar a la tercera forma normal en caso de que se encuentre en una menor forma normal.\n" +
"f) ¿Cuál es la finalidad de normalizar una BD?", objArea));
        
        listaProblemas.add(new Problema("Una empresa consultora posee un sistema que trabaja en una Base de datos relacional que  cumple el propósito de registrar los libros de compras y ventas de sus clientes, incluyendo  el caso de surtidores los libros de control de combustibles. Se está considerando entregar  como servicio adicional a todos los clientes un resumen de todos los movimientos  impositivos (y de combustibles en lo posible) como datos de apoyo futuras tomas de  decisiones de cada institución. \n" +
"Restaurando el respaldo de la base de datos, desarrollar los siguientes puntos: \n" +
"1) Analizar y definir objetivos de negocios a cumplir \n" +
"2) Diseñar el esquema del Data Warehouse de uno de los temas o procesos  identificados. \n" +
"a. Definir Dimensiones, Hechos y Métricas \n" +
"b. Crear el modelo lógico y la estructura en un DBMS \n" +
"3) Diseñar una consulta que muestre el total de los distintos combustibles vendidos por mes. \n" +
"4) Diseñar una consulta que muestre el total de incidencias de un NIT en ventas por día  de la semana. \n" +
"Deberán ser comprimidos en un archivo todos los elementos desarrollados (análisis,  modelo, ETL, consultas) junto a capturas de pantalla de los resultados de las consultas SQL.", objArea));
        
        listaProblemas.add(new Problema("Crear un diagrama ER utilizando cualquier herramienta para el siguiente escenario utilizando la lista de  especificaciones dadas. Describir todas las suposiciones realizadas. \n" +
"La consultora SR es una Institución dedicada al desarrollo de software a medida para sus clientes. Cuando  existe la solicitud de un trabajo, los gerentes en SR determinan los equipos a armar en base a las  necesidades requeridas en base a la cantidad de consultores y de las habilidades requeridas. Luego ubican  a todos los consultores disponibles con las habilidades requeridas y los asignan al proyecto. Uno de los  consultantes es asignado como el administrador de proyecto. Cuando el proyecto es terminado el  administrador del proyecto evalúa a todo el personal que participó en el proyecto y cada consultor del  proyecto evalúa al administrador del proyecto. Un proyecto puede ser subdividido en múltiples proyectos. \n" +
"Los Ítems necesarios en la base de datos de la consulta SR Incluye: \n" +
"1. La Información de cada consultor como ser el nombre, dirección, ciudad, zona, numero de  teléfono y dirección de correo electrónico. \n" +
"2. Descripción de las habilidades de cada empleado. \n" +
"3. Información del cliente como ser el nombre del cliente, nombre de contacto del cliente y numero  de teléfono de contacto. \n" +
"4. Información del proyecto como el nombre, el cliente asociado al proyecto, subproyectos  asociados, el administrador del proyecto y el set de habilidades requeridas. \n" +
"5. Fechas en la que cada consultor Inicio y termino trabajando en un proyecto en específico y el total  de horas trabajadas en el proyecto. \n" +
"6. Información de evaluación del consultor Incluyendo la fecha en la que fue completada la  evaluación, quién realizó la evaluación, el puntaje de la evaluación junto a un comentario. \n" +
"Adicionalmente a los requerimientos mencionados, se deben considerar las siguientes cinco reglas de  negocio: \n" +
"1. Un consultor puede tener una o más habilidades. Si tienen una habilidad en particular, se debe  mantener un registro de manera Indiferente si es que cuentan una certificación o no de dicha  habilidad \n" +
"2. Hay muchas habilidades requeridas, algunas de ellas puede que ningún consultor las tenga. 3. Un consultor puede ser asignado a múltiples proyectos al mismo tiempo. Hay tiempos de  \"Inactividad\" cuando un consultor podría no estar asignado a ningún proyecto. \n" +
"4. Un proyecto puede requerir variadas habilidades \n" +
"5. Un cliente tiene por lo menos un proyecto, pero puede tener más proyectos. Pero un proyecto  está asociado solamente a un cliente.\n" +
"Diseñar las siguientes consultas SQL para los siguientes escenarios: \n" +
"1. Obtener el nombre de cada ciudad donde un consultor vive. Eliminar los duplicados y desplegar  la lista en orden alfabético. \n" +
"2. Obtener el apellido de cada consultor y el nombre de cada proyecto en el que trabajan. 3. Mostrar cada id de proyecto y el número total de horas que los consultores han trabajado en ese  proyecto (mostrar solamente aquellos proyectos que acumularon más de 100 horas) \n" +
"Se desea analizar la información generada de las evaluaciones y los trabajos realizados para los clientes  de la consultora SR, pero existe una indecisión sobre que eventos analizar o dar prioridad para la  generación de dashboards o cuadros de mando como herramientas de resúmenes rápidos sobre el status  de la empresa en distintos campos. Para ello se requiere desarrollar los siguientes puntos: \n" +
"1) Analizar e identificar todos los posibles eventos o procesos de negocio a estudiar. a. Objetivo/s de negocios a cumplir \n" +
"b. Alcance del Data Warehouse: \n" +
"i. Límites y exclusiones del Data Warehouse (incluir funcionalidades que no se van a  contemplar, fuentes que no se van a incorporar). \n" +
"ii. Problemas a resolver (por ejemplo: proveer una única fuente de datos para análisis de  información, reducir el tiempo de obtención de informes, independizar a los analistas  de negocios de sistemas). \n" +
"2) Definir niveles de prioridad a cada proceso de negocio y explicar brevemente el motivo del  orden seleccionado. \n" +
"3) Diseñar el esquema de tipo constelación del Data Warehouse definiendo las Dimensiones,  Hechos y Métricas.", objArea));
        
        //objArea=4;//Infraestructura y seguridad
        
        return listaProblemas;
    }
    
    public String ObtenerLista(ArrayList<Problema> problema){
        String stProblemas="";
        for (int i = 0; i < problema.size(); i++) {
            stProblemas=stProblemas+problema.get(i).getDesarrollo()+ "\n";
        }
        return stProblemas;
    }
    
    public String ElegirProblema(ArrayList<Problema> problemas){
        String eleccion="";
        int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, problemas.size());
        eleccion=eleccion+problemas.get(numeroAleatorio).getDesarrollo()+"\n";
        return eleccion;
    }
    
    public String ElegirProblema(ArrayList<Problema> problemas, int objArea){
        String eleccion="";
        ArrayList<Problema> listaProblemas2=obtenerProblemaArea(problemas, objArea);
        if(listaProblemas2!=null){
            int numeroAleatorio=ThreadLocalRandom.current().nextInt(1, listaProblemas2.size());
            eleccion=eleccion+listaProblemas2.get(numeroAleatorio).getDesarrollo()+"\n";
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
