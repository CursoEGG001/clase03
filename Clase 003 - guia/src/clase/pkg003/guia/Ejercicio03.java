/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg003.guia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        
        System.out.println("Prueba escribir frase de 8 caracteres:");
        String comp = info.nextLine();
        int largo = comp.length();
                
        if ( largo!=8 ) {
            System.out.println("INCORRECTO");
    } else{
            System.out.println("CORRECTO");
    }
        
    }
}
