import java.util.Scanner;

public class Npares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de términos pares a sumar: ");
        int n = input.nextInt(); // leemos el número de términos a sumar

        int suma = 0; // inicializamos la variable de suma en cero
        int numeroPar = 2; // empezamos con el primer número par, que es el 2

        System.out.print("La suma de los primeros " + n + " números pares es: ");
        for (int i = 1; i <= n; i++) {
            suma += numeroPar; // sumamos cada número par a la variable de suma
            System.out.print(numeroPar); // mostramos el número par que se está sumando
            numeroPar += 2; // avanzamos al siguiente número par
            if (i < n) {
                System.out.print(" + "); // agregamos el signo de suma si no es el último término
            }
        }

        System.out.println(" = " + suma); // mostramos el resultado final de la suma
    }
}