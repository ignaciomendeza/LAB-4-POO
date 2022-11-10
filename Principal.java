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

        String menu = "\n======== RADIO ========\n1. Cambiar volumen\n2. Modo Radio\n3. Modo Reproducción\n4. Modo Teléfono\n5. Modo Productividad\n6.Apagar radio";
        

        try{
            System.out.println("¿Desea encender el radio?\n  1. SI\n  2. NO");
            int encender = teclado.nextInt();
            teclado.nextLine();
    
            if (encender == 1){
                
                while (modo >= 0){
                    System.out.println(menu);
                    modo = teclado.nextInt();
                    teclado.nextLine();
    
                    switch(modo){
                        case 1:
                            
                            break;
    
                        case 2:
    
                            break; 
                        
                        case 3: 
                        
                            break;
    
                        case 4: 
                            
                            break;
                        
                        case 5: 
                            
                            break;
                        
                        case 6:
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




