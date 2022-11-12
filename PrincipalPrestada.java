import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;

/**
 * Este programa es un software de radios de la compañia Mercedes.
 * @author: Allan Sebastián Paniagua Enríquez 18084
 *          Daniel Eliú Estuardo Machic de León  22118
 * @version: 11/11/2022
*/

public class PrincipalPrestada{
    public static void main(String[]  args){  
        Scanner teclado = new Scanner(System.in);
        Radio radio = new Radio();        
        Integer accion = 0;
        Integer idCancion = 0;
        Integer idContacto = 0;

        //--variables menu principal
        boolean salida = false;
        int opcion = 0;

        //--Variables Modo Radio
        boolean salidaRadio = false;
        int opcionRadio = 0;

        //--Variables Modo Reproduccion
        boolean salidaReproduccion = false;
        int opcionReproduccion = 0;

        //--Variables Modo Teléfono
        boolean salidaTelefono = false;
        int opcionTelefono = 0;

        //--Modo Produtividad
        boolean salidaProductividad = false;
        int opcionProductividad = 0;


        //Lista Canciones
        Cancion cancion1 = new Cancion("Bad Bunny", "3:00", "Tití Me Pregunto", "Reggaeton");
        Cancion cancion2 = new Cancion("Harry Styles", "3:00", "Late Night Talking", "Pop");
        Cancion cancion3 = new Cancion("Bad Bunny", "3:30", "Me Porto Bonito", "Reggaeton");
        Cancion cancion4 = new Cancion("Drake y Tems", "2:40", "Wait For U", "Hip-Hop");
        Cancion cancion5 = new Cancion("Harry Styles", "3:20", "As It Was", "Pop");

        radio.getListaReproduccion().add(cancion1);
        radio.getListaReproduccion().add(cancion2);
        radio.getListaReproduccion().add(cancion3);
        radio.getListaReproduccion().add(cancion4);
        radio.getListaReproduccion().add(cancion5);

        //Lista Contactos
        Contacto contacto1 = new Contacto("JUAN", "11221122");
        Contacto contacto2 = new Contacto("PIZZA", "22332233");
        Contacto contacto3 = new Contacto("MARIA", "44114411");
        Contacto contacto4 = new Contacto("PEPE", "66336633");
        Contacto contacto5 = new Contacto("MAGDALENA", "44112211");

        radio.getListaContactos().add(contacto1);
        radio.getListaContactos().add(contacto2);
        radio.getListaContactos().add(contacto3);
        radio.getListaContactos().add(contacto4);
        radio.getListaContactos().add(contacto5);
        
        //Lista Presentacion
        TarjetaPresentacion tarjetaPresentacion1 = new TarjetaPresentacion("Miguel","Ingeniero", "11221144", "miguel@gmail.com");
        TarjetaPresentacion tarjetaPresentacion2 = new TarjetaPresentacion("Michael","Licenciado", "4412211", "licenciadoM@gmail.com");
        TarjetaPresentacion tarjetaPresentacion3 = new TarjetaPresentacion("Mauricio","Ingeniero", "66221122", "mauricioIng@gmail.com");
        TarjetaPresentacion tarjetaPresentacion4 = new TarjetaPresentacion("Daniel","Abogado", "66117744", "dmachic@gmail.com");
        TarjetaPresentacion tarjetaPresentacion5 = new TarjetaPresentacion("Marcos","Contador", "55112211", "marcos@gmail.com");

        radio.getListaTarjetaPresentacion().add(tarjetaPresentacion1);
        radio.getListaTarjetaPresentacion().add(tarjetaPresentacion2);
        radio.getListaTarjetaPresentacion().add(tarjetaPresentacion3);
        radio.getListaTarjetaPresentacion().add(tarjetaPresentacion4);
        radio.getListaTarjetaPresentacion().add(tarjetaPresentacion5);

        while(salida  == false){
            System.out.println("MENU DE FUNCIONALIDADES");
            System.out.println("1. Encender / Apagar");
            System.out.println("2. Cambiar Volumen");
            System.out.println("3. Modo Radio");
            System.out.println("4. Modo Reproducción");
            System.out.println("5. Modo Teléfono");
            System.out.println("6. Modo Productividad");            
            System.out.println("7. Salida");

            opcion = Integer.parseInt(teclado.nextLine());

            switch(opcion){

                case 1:
                    radio.encenderApagar();
                break;

                case 2:
                    accion = 0;
                    System.out.println("1. Subir");
                    System.out.println("2. Bajar");

                    accion = Integer.parseInt(teclado.nextLine());

                    if(accion != 1){
                        radio.cambiarVolumen(-1);
                    }else{
                        radio.cambiarVolumen(1);
                    }                    
                break;

                case 3:
                    while(salidaRadio == false){
                        System.out.println("--- Modo Radio");
                        System.out.println("1. Cambiar FM a AM");
                        System.out.println("2. Cambiar Emisoras");                        
                        System.out.println("3. Salir");

                        opcionRadio = Integer.parseInt(teclado.nextLine());

                        switch(opcionRadio){
                            case 1:
                                radio.cambiarRadio();
                            break;

                            case 2:
                                accion = 0;
                                System.out.println("1. Subir");
                                System.out.println("2. Bajar");
                                        
                                accion = Integer.parseInt(teclado.nextLine());
                                if(accion != 1){
                                    radio.cambiarEmisora(0.5);
                                }else{
                                    radio.cambiarEmisora(-0.5);
                                }                            
                            break;

                            case 3:
                                salidaRadio = true;
                                System.out.println("Preparando para salir...");                                
                            break;                        
                        }
                    }

                break;

                case 4:
                    while(salidaReproduccion == false){
                        System.out.println("--- Modo Reproduccion");
                        System.out.println("1. Seleccionar Lista Configuracion");
                        System.out.println("2. Cambiar Cancion");                                                
                        System.out.println("4. Salir");

                        opcionReproduccion = Integer.parseInt(teclado.nextLine());

                        switch(opcionReproduccion){
                            case 1:
                                radio.desplegarListas();
                            break;

                            case 2:
                                accion = 0;
                                System.out.println("1. Subir");
                                System.out.println("2. Bajar");
                                        
                                accion = Integer.parseInt(teclado.nextLine());
                                if(accion != 1){
                                    idCancion = idCancion + 1;
                                    radio.cambiarCancion(idCancion);

                                }else{
                                    idCancion = idCancion - 1;
                                    radio.cambiarCancion(idCancion);
                                }   

                                System.out.println("Ahora estas escuchando...");
                                radio.cambiarCancion(opcionProductividad);

                            break;                            

                            case 4:
                                salidaReproduccion = true;
                                System.out.println("Preparando para salir...");   
                            break;
                        }
                    }

                break;

                case 5:
                    while(salidaTelefono == false){

                        System.out.println("--- Modo Telefono");
                        System.out.println("1. Conectar/Desconetcar");
                        System.out.println("2. Llamar Contacto");                                                
                        System.out.println("3. Finalizar llamada");                                        
                        System.out.println("4. Llamar al ultimo contacto");
                        System.out.println("5. Salir");

                        opcionTelefono = Integer.parseInt(teclado.nextLine());

                        switch(opcionTelefono){
                            case 1:
                                
                                accion = 0;
                                System.out.println("1. Conectar");
                                System.out.println("2. Desconetar");
                                accion = Integer.parseInt(teclado.nextLine());

                                if(accion != 1){
                                    radio.desconectar();
                                }else{                                    
                                    System.out.println("Ingrese el numero de telefono");
                                    int numero = Integer.parseInt(teclado.nextLine());

                                    radio.conecar(numero);
                                }   
                                
                            break;

                            case 2:
                                radio.desplegarContactos();
                                System.out.println("Selecciona el ID de un contacto");
                                idContacto = Integer.parseInt(teclado.nextLine());

                                radio.llamarColgar(2, idContacto);
                            break;

                            case 3:
                                radio.llamarColgar(1, idContacto);
                            break;

                            case 4:
                                radio.llamarColgar(2, idContacto);
                            break;

                            case 5:
                                salidaTelefono = true;
                                System.out.println("Preparando para salir...");   
                            break;
                        }
                    }

                break;

                case 6:
                    System.out.println("TARJETAS DE PRESENTACION...");
                    radio.desplegarTarjetas();
                break;

                default:
                    salida = true;
                    System.out.println("Preparando para salir...");                                
                break;
            }
        }
    }
}