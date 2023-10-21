/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg003.guia.extras;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EjercicioExtra03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase (solo toma la primer letra )");
        char primerLetra = leer.next().charAt(0);
        String letra = String.valueOf(primerLetra);
        boolean vocal = "a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra);

        if (vocal) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es vocal");
        }
    }
}
