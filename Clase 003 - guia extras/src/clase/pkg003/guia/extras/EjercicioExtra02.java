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
public class EjercicioExtra02 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un numero:");
        int a,b ,c , d, aux;
        aux=leer.nextInt();
        a=aux;
        b=a+aux;
        c=b-2*aux;
        d=b*c-aux;
        System.out.println("Estas seran las variables: A="+a+" B="+b+" C="+c+" D="+d);
        
        a=d;
        d=b;
        b=c;
        c=aux;
      
        System.out.println("Ahora: A="+a+" B="+b+" C="+c+" D="+d);
    }
}
