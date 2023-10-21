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
public class EjercicioExtra06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad e personas a leer ");
        int cantidad = sc.nextInt();
        double altura = 0, bajoPromedio = 0, promedio = 0;
        int contador = 0;

        for (int i = 0; i < cantidad; i++) {
            //do{
            System.out.println("Ingrese la Altura: ");
            altura = sc.nextDouble();
            if (altura < 1.60) {
                bajoPromedio += altura;
                contador++;
            }
            promedio += altura;
            //} while(altura>0 && altura<2.1);

        }
        System.out.println("el promedio " + (promedio / cantidad));
        System.out.println("el promedio bajo es " + (bajoPromedio / contador));
    }
}
