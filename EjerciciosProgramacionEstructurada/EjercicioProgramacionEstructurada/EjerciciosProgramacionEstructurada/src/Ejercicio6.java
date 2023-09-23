import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         double nuevo = 0;
         double interes = 0;
         double cargo = 0;
         int intentos=3,numero;
         do {
            System.out.print("Ingrese el número de cuenta: ");
            numero = lector.nextInt();
  
            if (numero <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            } 
          } while (intentos > 0);
  
          if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            return;
          } else {
            intentos = 3; 
        }
        System.out.print("Ingrese el tipo de cuenta (S para ahorros, C para cheques): ");
        char tipo = lector.next().charAt(0);
        System.out.print("Ingrese el saldo mínimo que debe mantener la cuenta: ");
        double minimo = lector.nextDouble();
        while (minimo < 0 && intentos > 0) {
            intentos--;
            if (intentos > 0) {
                System.out.println("Saldo mínimo inválido. Ingrese un valor no negativo.");
                minimo = lector.nextDouble();
            } else {
                System.out.println("Saldo mínimo inválido. Se han agotado los intentos.");
                break;
            }
        }

        intentos = 3;

         System.out.print("Ingrese el saldo actual de la cuenta: ");
        double actual = lector.nextDouble();
         while (actual < 0 && intentos > 0) {
            intentos--;
            if (intentos > 0) {
                System.out.println("Saldo actual inválido. Ingrese un valor no negativo.");
                actual = lector.nextDouble();
            } else {
                System.out.println("Saldo actual inválido. Se han agotado los intentos.");
                break;
            }
        }


        if (tipo == 'S' || tipo == 's') {
            if (actual < minimo) {
                cargo = 10;
                nuevo = actual - cargo;
            } else {
                interes = 0.04;
                nuevo = actual + actual * interes;
            }
        } else if (tipo == 'C' || tipo == 'c') {
            if (actual < minimo) {
                cargo = 25;
                nuevo = actual - cargo;
            } else {
                if (actual <= minimo + 5000) {
                    interes = 0.03;
                } else {
                    interes = 0.05;
                }
                nuevo = actual + actual * interes;
            }
        } else {
            System.out.println("Tipo de cuenta inválido. Por favor, ingrese S o C.");
            return; 
        }
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Tipo de cuenta: " + tipo);
        System.out.println("Saldo actual: U$" + actual);
        System.out.println("Saldo nuevo: U$" + nuevo);
        lector.close();
    }
}