//ESTE PROGRAMA CALCULA EL AREA Y EL PERIMETRO DE UN CIRCULO

//             ALGORITMO                                      
//Pedir el radio del circulo a el usuario                                    
//Recibir el radio y asignarlo a la variable  r                              
//El perimetro de un circulo viene dado por: P = 2pir                        
//El area de un circulo viene dada por A = pi*r*r                            
//Presentar como salida el perimetro                                         
//Presentar como salida el area*/

 import java.util.Scanner; 
 public class DiametroCircunferenciaYAreaDeUnCirculo
 {
     public static void main(String arg[])
     {
         Scanner entrada = new Scanner(System.in); 
         int radio;

         System.out.println("\nPor favor introduzca un radio y le dare el diametro, el perimetro y el area:");
         radio = entrada.nextInt();
         
         System.out.printf("\nEl diametro del circulo es: %d", 2*radio);
         System.out.printf("\nEl perimetro del circulo es: %f", 2*Math.PI*radio);
         System.out.printf("\nEl area del circulo es: %f\n", Math.PI*radio*radio); 
     }     
 }