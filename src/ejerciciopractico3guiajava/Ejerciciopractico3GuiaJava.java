/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() 
y toLowerCase() en Java.
 */
package ejerciciopractico3guiajava;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Ejerciciopractico3GuiaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor ingrese una frase: ");
        String frase = leer.nextLine();
        
        String frasemay = frase.toUpperCase();
        String frasemin = frase.toLowerCase();
        
        System.out.println("La frase que introdujo en MAYUSCULA es: ");
        System.out.println("" + frasemay);
        System.out.println("La frase que introdujo en minúscula es: ");
        System.out.println("" + frasemin);
        
        
        
    }
    
}
