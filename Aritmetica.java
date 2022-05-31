// programa que recibe dos numeros, calcula e imprime su suma, diferencia, producto y cociene

 import java.util.Scanner;

 public class Aritmetica
 {
     public static void main( String args[] )
     {
        Scanner entrada = new Scanner(System.in);

          int numero1;
          int numero2;
          int suma;
          int diferencia;
          int producto;
          int cociente;

          System.out.print("\nEste programa recibe dos numeros y da su suma, diferencia, producto y cociente.\n");

          System.out.println("Ingrese el primer numero: ");
          numero1 = entrada.nextInt();

          System.out.println("Ingrese el segundo numero: ");
          numero2 = entrada.nextInt();

          suma= numero1 + numero2;
          diferencia = numero1 + numero2;
          producto = numero1*numero2;
          cociente = numero1/numero2;

          System.out.printf("\nLa suma de los numeros es: %d\n", suma);
          System.out.printf("\nLa diferencia de los numeros es: %d\n", diferencia);
          System.out.printf("\nEl producto de los numeros es: %d\n", producto);
          System.out.printf("\nEl cociente de los numeros es: %d\n", cociente);
     }
 }