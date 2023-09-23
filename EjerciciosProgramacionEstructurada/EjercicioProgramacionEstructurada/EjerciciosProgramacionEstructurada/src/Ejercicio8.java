import java.util.Scanner;

public class Ejercicio8{
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int intentos = 3;
        double longitud = 0;
        double ancho = 0;
           int numCoronas = 0;
        do {
            System.out.print("Ingrese la logitud en pulgadas de la fotografia: ");
            longitud = lector.nextDouble();
  
            if (longitud <= 0) {
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
            do {
                System.out.print("Ingrese el ancho en pulgadas de la fotografia: ");
                ancho = lector.nextDouble();
  
                if (ancho <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
              } while (intentos > 0);
  
             if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                return;
              }
          }
        

         System.out.print("Ingrese el tipo de marco (regular/lujoso): ");
         String tipoMarco = lector.next();

         System.out.print("Ingrese el color del marco: ");
         String colorMarco = lector.next();

        System.out.print("¿Desea agregar coronas? (sí/no): ");
        String agregarCoronas = lector.next();
        if (agregarCoronas.equals("si")) {
            System.out.print("Ingrese el número de coronas: ");
            numCoronas = lector.nextInt();
        }
      
        

        double costoMarco = 0;
        if (tipoMarco.equals("regular")) {
            costoMarco = 0.15 * (longitud + ancho);
        } else if (tipoMarco.equals("lujoso")) {
            costoMarco = 0.25 * (longitud + ancho);
        }

        double costoPintura = 0.10 * (longitud + ancho);
        double costoCarton = 0.02 * longitud * ancho;
        double costoVidrio = 0.07 * longitud * ancho;
        double costoCoronas = 0.35 * numCoronas;

        double costoTotal = costoMarco + costoPintura + costoCarton + costoVidrio + costoCoronas;

        System.out.println("\nCosto de enmarcar la fotografía:");
        System.out.println("Marco: $" + costoMarco);
        System.out.println("Pintura: $" + costoPintura);
        System.out.println("Cartón: $" + costoCarton);
        System.out.println("Vidrio: $" + costoVidrio);
        System.out.println("Coronas: $" + costoCoronas);
        System.out.println("Costo total: $" + costoTotal);

        lector.close();
    }
}