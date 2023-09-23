import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
 public static void main(String [] args){
    Scanner lector = new Scanner(System.in);
   Random random = new Random();

        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            int numeroAdivinar = random.nextInt(50) + 1;
            int intentos = 0;

            System.out.println("Adivina un número entre 1 y 50.");

            while (intentos < 3) {
                System.out.print("Introduce un numero: ");
                int intento = lector.nextInt();
                intentos++;

                if (intento < 1 || intento > 50) {
                    System.out.println("El número debe estar entre 1 y 50.");
                    continue;
                }

                if (intento < numeroAdivinar) {
                    System.out.println("Demasiado bajo. Inténtalo de nuevo.");
                } else if (intento > numeroAdivinar) {
                    System.out.println("Demasiado alto. Inténtalo de nuevo.");
                } else {
                    System.out.println("¡Felicidades! ¡Adivinaste el número!");
                    break;
                }
            }

            if (intentos >= 3) {
                System.out.println("Agotaste tus intentos. El número a adivinar era: " + numeroAdivinar);
            }

            System.out.print("¿Deseas jugar otra vez? (S/N): ");
            String respuesta = lector.next();
            jugarDeNuevo = respuesta.equalsIgnoreCase("S");
        }

        System.out.println("Gracias por jugar. ¡Hasta luego!");

        lector.close();
    }
}

