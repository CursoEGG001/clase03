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
public class EjercicioExtra01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingresa un tiempo en minutos");
//        int minutos = leer.nextInt();
//        int horas = minutos / 60;
//        int dias = 0;
//        while (horas >= 24) {
//            horas -= 24;
//            dias++;
//        }
//        System.out.println("Su equivalente en días es " + dias + " y horas " + horas);
//    }

        System.out.println("Ingrese un tiempo en minutos: ");
        int min = leer.nextInt();
        int dia = (min / (24 * 60));
        int horas = (min - (dia * 24 * 60)) / 60;
        //int minut=(min - (horas*60));
        System.out.println("Serian " + dia + " dia(s) " + horas + " horas ");
    }
}