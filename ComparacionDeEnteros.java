//Este programa recibe dos numeros enteros e imprime la relacion de orden que hay entre ellos
  
import java.util.Scanner;
  
public class ComparacionDeEnteros
{
    public static void main( String args[] )
    {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("\nIngrese el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.println("\nIngrese el segundo entero: ");
        numero2 = entrada.nextInt();

        if ( numero1 > numero2 )
        System.out.printf("\nEl numero %d es mayor que %d\n", numero1, numero2);
         
        if ( numero2 > numero1 )
        System.out.printf("\nEl numero %d es mayor que %d\n", numero2, numero1);
         
        if ( numero1 == numero2 )
        System.out.printf( "\nEl numero %d es igual al numero %d\n", numero1, numero2);
    }
}