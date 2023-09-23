import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos=3;
        int numCuenta;
        do {
            System.out.print("Ingrese el numero de cuenta del cliente: ");
            numCuenta= lector.nextInt();
  
            if (numCuenta <= 0) {
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
        
        System.out.print("Ingrese el código del cliente (R para residencial, N para negocios): ");
        char codigoCliente = lector.next().charAt(0);

         do {
            System.out.print("Ingrese el número de canales Premium a los que está suscrito: ");
            int canalesPremium = lector.nextInt();

            if (canalesPremium <= 0) {
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
     
        int canalesPremium = lector.nextInt();

        double totalFactura= 0.0;

        if (codigoCliente == 'R' || codigoCliente == 'r') {
            double procesamientoFactura = 4.50;
            double serviciobasico = 20.50;
            double facCanalesPremium = 7.50;

            totalFactura = procesamientoFactura + serviciobasico + (facCanalesPremium * canalesPremium);
        } else if (codigoCliente == 'N' || codigoCliente == 'n') {
            double procesamientoFactura = 15.00;
            double serviciobasico = 75.00;
            double facCanalesPremium = 50.00;

            System.out.print("Ingrese el número de conexiones de servicio básico: ");
            int conexionesbasico = lector.nextInt();

            if (conexionesbasico > 10) {
                totalFactura = procesamientoFactura + serviciobasico + (facCanalesPremium * canalesPremium) + ((conexionesbasico - 10) * 5.00);
            } else {
                totalFactura = procesamientoFactura + serviciobasico + (facCanalesPremium * canalesPremium);
            }
        }

        System.out.println("Número de cuenta del cliente: " + numCuenta);
        System.out.println("Monto de la factura: C$" + totalFactura);

        lector.close();
    }
}