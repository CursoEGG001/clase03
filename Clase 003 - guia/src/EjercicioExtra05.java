
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class EjercicioExtra05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el tipo de socio:");
        char letra = leer.nextLine().charAt(0);
        
        System.out.println("ingrese el valor del tratamiento ");
        int costo= leer.nextInt();
        
        switch (letra) {
            case 'a':
            case 'A':
                System.out.println("el costo de tratamiento sera : " + (costo*0.5));
                break;
            case 'b':
            case 'B':
                 System.out.println("el costo de tratamiento sera : " + (costo*0.35));
                break;
            case 'c':
            case 'C':
                 System.out.println("el costo de tratamiento sera : " + costo);
                break;
            
            default:
                System.out.println("escribiste un valor no valido");
        }
    }
}
