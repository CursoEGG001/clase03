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
public class EjercicioExtra04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero:");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("I");
                break;

            case 2:
                System.out.println(" II ");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;

            case 6:
                System.out.println("VI");
                break;

            case 7:
                System.out.println("VII");
                break;

            case 8:
                System.out.println("VIII");
                break;

            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");

                break;
            default:
                System.out.println("No esta entre 1 y 10");
    }
}
}