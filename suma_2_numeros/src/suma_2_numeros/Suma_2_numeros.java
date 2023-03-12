package suma_2_numeros;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Suma_2_numeros {

 
    public static void main(String[] args) {
        double num1,num2,resultado;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("inserta el numero 1");
        num1=Teclado.nextDouble();
         System.out.println("inserta el numero 2");
        num2=Teclado.nextDouble();
        resultado=num1+num2;
        System.out.println("la suma es"+resultado);
        
    }
}
