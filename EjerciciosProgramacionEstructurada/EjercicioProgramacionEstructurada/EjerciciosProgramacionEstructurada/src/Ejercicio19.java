import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int cantidadClientes;
        double totalRecibosAyer = 0.0;

        System.out.print("Ingrese la cantidad de clientes: ");
        cantidadClientes = lector.nextInt();

        for (int i = 1; i <= cantidadClientes; i++) {
            int intentos = 0;
            double cargo = 0.0;
            while (intentos < 3) {
                System.out.print("Ingrese las horas de estacionamiento para el cliente " + i + ": ");
                int horasEstacionamiento = lector.nextInt();
                if (horasEstacionamiento >= 0) {
                    cargo = 2.00; 
                    if (horasEstacionamiento > 3) {
                        int horasExcedentes = horasEstacionamiento - 3;
                        cargo += horasExcedentes * 0.50;
                    }
                    if (cargo > 10.00) {
                        cargo = 10.00;
                    }
                      break;
                } else {
                    System.out.println("Las horas de estacionamiento deben ser no negativas. Intentos restantes: " + (2 - intentos));
                    intentos++;
                }
            }
             if (intentos == 3) {
                System.out.println("Se han realizado 3 intentos fallidos. No se puede calcular el cargo para el cliente " + i);
                continue;
            }

            totalRecibosAyer += cargo;
            System.out.println("El cargo por estacionamiento para el cliente " + i + " es: C$" + cargo);
        }
           System.out.println("El total corriente de los recibos de ayer es: C$" + totalRecibosAyer);
           lector.close();
    }
}