import java.util.Scanner;
 
public class Ejercicio17 {
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
  
      int intentos = 0;
      int cantidad1=0;
      int cantidad2=0;
      int cantidad3=0;
      int cantidad4=0;
      
      while (intentos < 3) {
          System.out.print("Ingrese la cantidad de artículos 1 vendidos: ");
          cantidad1 = lector.nextInt();
          
          if (cantidad1 >= 0) {
              break;
          }
          
          intentos++;
          System.out.println("La cantidad no puede ser negativa. Intentos nuevamente: ");
      }
      
      if (intentos == 3 && cantidad1 < 0) {
          System.out.println("Has agotado tus intentos. Programa terminado.");
          return;
      }
      
      intentos = 0;
      
      while (intentos < 3) {
          System.out.print("Ingrese la cantidad de artículos 2 vendidos: ");
          cantidad2 = lector.nextInt();
          
          if (cantidad2 >= 0) {
              break;
          }
          
          intentos++;
          System.out.println("La cantidad no puede ser negativa. Intentos nuevamete: ");
      }
      
      if (intentos == 3 && cantidad2 < 0) {
          System.out.println("Has agotado tus intentos. Programa terminado.");
          return;
      }
      
      intentos = 0;
      
      while (intentos < 3) {
          System.out.print("Ingrese la cantidad de artículos 3 vendidos: ");
          cantidad3 = lector.nextInt();
          
          if (cantidad3 >= 0) {
              break;
          }
          
          intentos++;
          System.out.println("La cantidad no puede ser negativa. Intentos nuevamente: " );
      }
      
      if (intentos == 3 && cantidad3 < 0) {
          System.out.println("Has agotado tus intentos. Programa terminado.");
          return;
      }
      
      intentos = 0;
      
      while (intentos < 3) {
          System.out.print("Ingrese la cantidad de artículos 4 vendidos: ");
          cantidad4 = lector.nextInt();
          
          if (cantidad4 >= 0) {
              break;
          }
          
          intentos++;
          System.out.println("La cantidad no puede ser negativa. Intentos nuevamente: " );
      }
      
      if (intentos == 3 && cantidad4 < 0) {
          System.out.println("Has agotado tus intentos. Programa terminado.");
          return;
      }
      
      double valor1 = 239.99;
      double valor2 = 129.75;
      double valor3 = 99.95;
      double valor4 = 350.89;
      

      double totalVentas = cantidad1 * valor1 + cantidad2 * valor2 + cantidad3 * valor3 + cantidad4 * valor4;
      double comision = totalVentas * 0.09 + 200;
  
      System.out.println("Ingresos del vendedor: C$" + comision);
      lector.close();
    }
  }