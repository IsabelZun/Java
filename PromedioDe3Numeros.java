//Calcular el promedio de 3 numeros
import java.util.Scanner;
public class PromedioDe3Numeros
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);

        System.out.print("Programa que calcule el promedio de 3 numeros: ");

        System.out.print("Ingrese el primer numero: ");
        int n1=num.nextInt();

        System.out.print("Ingrese el primer numero: ");
        int n2=num.nextInt();

        System.out.print("Ingrese el primer numero: ");
        int n3=num.nextInt();

        float Resultado=(float)(n1+n2+n3)/3;
        System.out.print("El promedio es: " + Resultado);

    }
}
