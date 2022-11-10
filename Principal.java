/*
 * Oscar Flores, Ignacio Méndez y Ariela Mishaan
 * POO Sección 40
 * Laboratorio #4
 * 11-11-2022
 * Clase Main
 */

import java.util.Scanner;

public class Principal{
    
    /** Método MAIN que lleva a cabo la interacción con el usuario
     * @param args
     */
    public static void main(String[] args){

        Radio radio = new Radio();
        Scanner teclado = new Scanner(System.in);
        int modo = 1;
        boolean continuar = true;

        String menu = "\n======== RADIO ========\n1. Cambiar volumen\n2. Modo Radio\n3. Modo Reproducción\n4. Modo Teléfono\n5. Modo Productividad\n6.Apagar radio";
        
        try{
            System.out.println("\n¿Desea encender el radio?\n  1. SI\n  2. NO");
            int encender = teclado.nextInt();
            teclado.nextLine();
    
            if (encender == 1){
                
                while (modo >= 0 && modo < 6){
                    
                    System.out.println(menu);
                    System.out.println("\nEscoja una opción: ");
                    modo = teclado.nextInt();
                    teclado.nextLine();
    
                    switch(modo){
                        case 1: //Cambiar volumen
                            System.out.println("\n1. Subir volumen\n2. Bajar Volumen\nEscoja una opción: ");
                            int subirBajar = teclado.nextInt();
                            teclado.nextLine();

                            if(subirBajar != 1 && subirBajar != 2){
                                System.out.println("Ingrese un número válido.");

                                boolean entradaIncorrectaSubirBajar = true;
                                while(entradaIncorrectaSubirBajar){

                                    System.out.println("\n1. Subir volumen\n2. Bajar Volumen\nEscoja una opción: ");
                                    subirBajar = teclado.nextInt();
                                    teclado.nextLine();

                                    if(subirBajar == 1 || subirBajar == 2){
                                        entradaIncorrectaSubirBajar = false;
                                    }
                                    else{
                                        System.out.println("Ingrese un número válido.");
                                    }
                                }
                            }
                            break;
    
                        case 2: //Modo Radio
                            radio.cambiarModo(1);
                            while (modo == 2) {
                                String menuRadio = "\n--- MODO RADIO ---\n1. Cambiar de FM a AM\n2. Cambiar Emisora\n3. Guardar emisora actual\n4. Cargar emisora\n5. Cambiar de Modo\nEscoja una opción: ";
                                int opcionRadio = teclado.nextInt();
    
                                switch (opcionRadio) {
                                    case 1: //cambiar de FM a AM
                                        System.out.println(radio.cambiarRadio());
                                        break;

                                    case 2: //Cambiar emisora
                                        System.out.println("\n1. Subir de emisora\n2. Bajar de emisora\nEscoja una opción: ");
                                        int subirBajarEmisora = teclado.nextInt();
                                        teclado.nextLine();

                                        if(subirBajarEmisora != 1 && subirBajarEmisora != 2){
                                            System.out.println("Ingrese un número válido.");

                                            boolean entradaIncorrectaSubirBajar = true;
                                            while(entradaIncorrectaSubirBajar){

                                                System.out.println("\n1. Subir de emisora\n2. Bajar de emisora\nEscoja una opción: ");
                                                subirBajarEmisora = teclado.nextInt();
                                                teclado.nextLine();

                                                if(subirBajarEmisora == 1 || subirBajarEmisora == 2){
                                                    entradaIncorrectaSubirBajar = false;
                                                }
                                                else{
                                                    System.out.println("Ingrese un número válido.");
                                                }
                                            }
                                        }

                                        System.out.println(radio.cambiarEmisora(subirBajarEmisora));
                                        break;

                                    case 3: //guardar emisora actual
                                        radio.guardarEmisora();
                                        System.out.println("La emisora ha sido guardada.");
                                        System.out.println(radio.toString());
                                        break;

                                    case 4: //cargar Emisora
                                        try {
                                            System.out.println(radio.desplegarEmisoras());
                                            System.out.println("\nIngrese el número de la emisora que quiere cargar: ");
                                            int numeroEmisora = teclado.nextInt();
                                            teclado.nextLine();
                                            System.out.println(radio.cargarEmisora(numeroEmisora));
                                            
                                        } catch (Exception e) {
                                            // TODO: handle exception
                                            System.out.println("Ingrese un número válido.");
                                        }
                                        break;

                                    case 5: //Cambiar de modo
                                        modo = 0;
                                        break;
                                
                                    default:
                                        System.out.println("Escoja una opción correcta.");
                                        break;
                                }
                            }
                            break; 
                        
                        case 3: //Modo Reproducción
                            radio.cambiarModo(2);
                            while(modo ==3){
                                String menuReproduccion = "\n--- MODO REPRODUCCIÓN ---\n1. Seleccionar lista de reproducción\n2. Cambiar Canción\n3. Escuchar canción\n4. Cambiar de modo\nEscoja una opción: ";
                                int opcionReproduccion = teclado.nextInt();

                                switch (opcionReproduccion) {
                                    case 1: //Seleccionar lista de reproducción
                                        try {
                                            System.out.println(radio.desplegarListas());
                                            System.out.println("\nEscoja una lista: ");
                                            int opcionLista = teclado.nextInt();
                                            teclado.nextLine();
                                            System.out.println(radio.seleccionarLista(opcionLista));

                                        } catch (Exception e) {
                                            // TODO: handle exception
                                            System.out.println("\nEscoja un número válido.");
                                        }
                                        break;

                                    case 2: //Cambiar Canción
                                        System.out.println("\n1. Subir de canción\n2. Bajar de canción\nEscoja una opción: ");
                                        int subirBajarCancion = teclado.nextInt();
                                        teclado.nextLine();

                                        if(subirBajarCancion != 1 && subirBajarCancion != 2){
                                            System.out.println("Ingrese un número válido.");

                                            boolean entradaIncorrectaSubirBajar = true;
                                            while(entradaIncorrectaSubirBajar){

                                                System.out.println("\n1. Subir de canción\n2. Bajar de canción\nEscoja una opción: ");
                                                subirBajarCancion = teclado.nextInt();
                                                teclado.nextLine();

                                                if(subirBajarCancion == 1 || subirBajarCancion == 2){
                                                    entradaIncorrectaSubirBajar = false;
                                                }
                                                else{
                                                    System.out.println("Ingrese un número válido.");
                                                }
                                            }
                                        }

                                        System.out.println(radio.cambiarCancion(subirBajarCancion));
                                        break;

                                    case 3://Escuchar canción
                                        
                                    System.out.println(radio.desplegarCanciones());
                                        
                                        try {
                                            System.out.println("\nEscoja una opción: ");
                                            int opcionCancion = teclado.nextInt();
                                            teclado.nextLine();
                                            System.out.println(radio.escucharCancion(opcionCancion));

                                        } catch (Exception e) {
                                            // TODO: handle exception
                                            System.out.println("Escoja un número válido.");
                                        }
                                        break;

                                    case 4://Cambiar de modo
                                        modo = 0;
                                        break;
                                
                                    default:
                                        System.out.println("Escoja una opción correcta.");
                                        break;
                                }
                            }
                            break;
    
                        case 4: //Modo Teléfono
                            
                            break;
                        
                        case 5: //Modo productividad
                            
                            break;
                        
                        case 6: //Apagar radio
                            System.out.println("\nApagando el radio...");
                            System.exit(0);
                            break;
                        
                        default:
                        System.out.println("\nPor favor ingresa un número del 1 al 6.");
                        break;
                    }
                
                }
    
            }
            else{
                System.exit(0);
            }

        } catch (Exception e){
            teclado.nextLine();
            System.out.println("\nEntrada incorrecta. Verifique que el tipo de dato ingresado sea el solicitado.");
            System.out.println();
        }

        teclado.close();
    }
}




