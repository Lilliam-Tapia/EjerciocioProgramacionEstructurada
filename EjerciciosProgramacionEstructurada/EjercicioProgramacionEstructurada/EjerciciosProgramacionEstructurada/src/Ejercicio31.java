import java.util.Scanner;

public class Ejercicio31 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Ingrese un número entero positivo grande: ");
            int numero = lector.nextInt();

            if (numero > 0) {
                System.out.println("Los factores primos de " + numero + " son:");
                int divisor = 2;
                while (numero > 1) {
                    if (numero % divisor == 0) {
                        System.out.println(divisor);
                        numero /= divisor;
                    } else {
                        divisor++;
                    }
                }
                break;
            } else {
                System.out.println("El número debe ser mayor que cero. Intentos restantes: " + (intentos - 1));
                intentos--;
            }
        }

        if (intentos == 0) {
            System.out.println("Se agotaron los intentos.");
        }

        lector.close();
    }
}