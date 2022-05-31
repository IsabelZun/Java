//Programa que recibe tres numeros y muestra el promedio

import java.util.Scanner;

public class Promedio
{
    //el metodo main empieza la ejecucion de la aplicacion en java
    public static void main (String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int promedio;

        System.out.printf("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.printf("Escriba el primer entero: ");
        numero2 = entrada.nextInt();

        System.out.printf("Escriba el primer entero: ");
        numero3 = entrada.nextInt();

        promedio = (numero1 + numero2 + numero3)/3;

        System.out.printf("El promedio es %d%n ", promedio);
    }
}