/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Ciclofor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de términos a sumar: ");
        int n = input.nextInt(); // leemos el número de términos a sumar

        int suma = 0; // inicializamos la variable de suma en cero

        System.out.print("La suma de los primeros " + n + " números naturales es: ");
        for (int i = 1; i <= n; i++) {
            suma += i; // sumamos cada término a la variable de suma
            System.out.print(i); // mostramos el número que se está sumando
            if (i < n) {
                System.out.print(" + "); // agregamos el signo de suma si no es el último término
            }
        }

        System.out.println(" = " + suma); // mostramos el resultado final de la suma
    }
}