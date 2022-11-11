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
        int opcionContacto = 0;
        int modo = 1;
        boolean conectado = false;
        boolean finalizado = false;
        
        boolean continuar = true;

        String menu = "\n======== RADIO ========\n1. Cambiar volumen\n2. Modo Radio\n3. Modo Reproducción\n4. Modo Teléfono\n5. Modo Productividad\n6.Apagar radio";
        
        while(modo >=0 && modo < 6){
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
                                modo = 1;
                                System.out.println(radio.cambiarModo(1));
                                while (modo == 1) {
                                    System.out.println("\n--- MODO RADIO ---\n1. Cambiar de FM a AM\n2. Cambiar Emisora\n3. Guardar emisora actual\n4. Cargar emisora\n5. Cambiar de Modo\nEscoja una opción: ");
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
                                                if (radio.verificar(1)){
                                                    System.out.println(radio.desplegarEmisoras());
                                                    System.out.println("\nIngrese el número de la emisora que quiere cargar: ");
                                                    int numeroEmisora = teclado.nextInt();
                                                    teclado.nextLine();
                                                    System.out.println(radio.cargarEmisora(numeroEmisora));
                                                }
                                                else{
                                                    System.out.println(radio.desplegarEmisoras());
                                                }
                                                
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
                                System.out.println(radio.cambiarModo(2));
                                modo = 2;
                                while(modo ==2){
                                    System.out.println("\n--- MODO REPRODUCCIÓN ---\n1. Seleccionar lista de reproducción\n2. Cambiar Canción\n3. Escuchar canción\n4. Cambiar de modo\nEscoja una opción: ");
                                    int opcionReproduccion = teclado.nextInt();
    
                                    switch (opcionReproduccion) {
                                        case 1: //Seleccionar lista de reproducción
                                            try {
                                                if (radio.verificar(2)){
                                                    System.out.println(radio.desplegarListas(""));
                                                    System.out.println("\nEscoja una lista: ");
                                                    int opcionLista = teclado.nextInt();
                                                    teclado.nextLine();
                                                    System.out.println(radio.seleccionarLista(opcionLista));
                                                }
                                                else{
                                                    System.out.println(radio.desplegarListas(""));
                                                }
    
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
                                System.out.println(radio.cambiarModo(3));
                                modo = 3;
                                while(modo ==3){
                                    
                                    System.out.println("\n--- MODO TELÉFONO ---\n1. Conectar o desconectar un teléfono");
                                    int opcionTelefono = teclado.nextInt();
    
                                    switch (opcionTelefono) {
                                        case 1: //Conectar/desconectar teléfono
    
                                            if (conectado){
                                                System.out.println(radio.desconectar());
                                            }
    
                                            else{
                                                System.out.println("\nTeléfonos cercanos: \n1. Teléfono de Ariela\n2. Teléfono de Ignacio\n3. Teléfono de Oscar\nEscoja una opción:");
                                                int telefonoEscoger = teclado.nextInt();
                                                teclado.nextLine();
        
                                                try {
                                                    System.out.println(radio.conectar(telefonoEscoger));
        
                                                } catch (Exception e) {
                                                    // TODO: handle exception
                                                    System.out.println("\nEscoja una opción válida.");
                                                }
                                                
                                            }
                                            modo = 0;
                                            
                                            break;
    
                                        case 2: //mostrar contactos
                                            System.out.println(radio.desplegarContactos(""));
                                            break;
    
                                        case 3://llamar a contacto
                                            System.out.println(radio.desplegarContactos("")); 
                                            
                                            try {
                                                System.out.println("\nEscoja una opción: ");
                                                opcionContacto = teclado.nextInt();
                                                System.out.println(radio.llamarColgar(1, opcionContacto));
                                                finalizado = false;
    
                                            } catch (Exception e) {
                                                // TODO: handle exception
                                                System.out.println("\nEscoja una opción válida.");
                                            }
                                            break;
    
                                        case 4: //finalizar llamada
    
                                            if (finalizado) {
                                                System.out.println("\nNo hay llamada activa, no se puede colgar.");
                                            } 
                                            if (opcionContacto != 0) {
                                                System.out.println(radio.llamarColgar(2,opcionContacto));
                                            }
                                            break;
    
                                        case 5: //llamar al último contacto con el que se habló
                                            System.out.println(radio.llamarColgar(1, opcionContacto));
                                            
                                            break;
    
                                        case 6://Cambiar de modo
                                            modo = 0;
                                            break;
                                    
                                        default:
                                            System.out.println("Escoja una opción correcta.");
                                            break;
                                    }
                                }
                                break;
                            
                            case 5: //Modo productividad
                                
                                System.out.println(radio.cambiarModo(4));
                                System.out.println(radio.desplegarTarjetas());
                                modo = 0;
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
        }
    }
}




