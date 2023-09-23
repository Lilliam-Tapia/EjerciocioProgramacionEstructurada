
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese los numeros: ");
        String numeros = lector.next();
        for (int i = 0; i < numeros.length(); i++) {
            System.out.print(numeros.charAt(i) + " ");
        }
        int suma = 0;
        int i = 0;
        while (i < numeros.length()) {
            char digito = numeros.charAt(i);
            if (digito >= '0' && digito <= '9') {
                int valor = digito - '0';
                suma += valor;
            }
            i++;
        }

        System.out.println("La suma de los dígitos ingresados es: " + suma);
     lector.close();
    }
}