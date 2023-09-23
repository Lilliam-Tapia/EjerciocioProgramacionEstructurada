import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1, numero2;
    do {
     System.out.print("Ingrese el primer número entero: ");
     numero1 = lector.nextInt();
    } while (numero1 < 0);

    do {
     System.out.print("Ingrese el segundo número entero: ");
     numero2 = lector.nextInt();
    } while (numero2 < 0);

     if (numero1 >= numero2) {
     System.out.println("El primer número debe ser menor que el segundo.");
     return; 
    }

   System.out.println("Números impares entre " + numero1 + " y " + numero2 + ":");
   int sumaCuadradosImpares = 0;
   for (int i = numero1; i <= numero2; i++) {
     if (i % 2 != 0) {
         System.out.println(i);
         sumaCuadradosImpares += i * i;
     }
   }
   System.out.println("Suma de los cuadrados de los números impares: " + sumaCuadradosImpares);

   System.out.println("Números perfectos entre " + numero1 + " y " + numero2 + ":");
   for (int i = numero1; i <= numero2; i++) {
     int sumaDivisores = 0;
     for (int j = 1; j < i; j++) {
         if (i % j == 0) {
             sumaDivisores += j;
         }
     }
     if (sumaDivisores == i) {
         System.out.println(i);
     }
 }

 System.out.println("Números primos entre " + numero1 + " y " + numero2 + ":");
 for (int i = numero1; i <= numero2; i++) {
     boolean esPrimo = true;
     for (int j = 2; j <= Math.sqrt(i); j++) {
         if (i % j == 0) {
             esPrimo = false;
             break;
         }
     }
     if (esPrimo) {
         System.out.println(i);
     }
 }

 System.out.println("Suma de los números pares entre " + numero1 + " y " + numero2 + ":");
 int sumaPares = 0;
 for (int i = numero1; i <= numero2; i++) {
     if (i % 2 == 0) {
         sumaPares += i;
     }
 }
 System.out.println(sumaPares);
 lector.close();
        
    }
}