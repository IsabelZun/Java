//Este programa recibe un entero e imprime si es  par o no
   
import java.util.Scanner;

public class ParOImpar

{
    public static void main(String args[])
    {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nIngrese un numero y sabra si es par o impar.");
        numero = entrada.nextInt();
          
        if( 0 == numero % 2 )
        System.out.println("\nEl numero es par.");
          
        if ( 0 != numero % 2)
        System.out.println("\nEl numero es impar.");
    }
}