import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3;

        double prestamo;
        do {
            System.out.print("Ingrese el monto del préstamo: ");
            prestamo = lector.nextDouble();
            
            if (prestamo <= 0) {
                System.out.println("El monto del préstamo debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            }
            
            if (intentos == 0) {
                System.out.println("Se ha alcanzado el límite de intentos. El programa se cerrará.");
                System.exit(0);
            }
        } while (prestamo <= 0);
        
        double tasa;
        do {
            System.out.print("Ingrese la tasa de interés anual (como un porcentaje): ");
            tasa = lector.nextDouble();
            
            if (tasa <= 0) {
                System.out.println("La tasa de interés debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            }
            
            if (intentos == 0) {
                System.out.println("Se ha alcanzado el límite de intentos. El programa se cerrará.");
                System.exit(0);
            }
        } while (tasa <= 0);
        
        double pago;
        do {
            System.out.print("Ingrese el pago mensual: ");
            pago = lector.nextDouble();
            
            if (pago <= 0) {
                System.out.println("El pago mensual debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            }
            
            if (intentos == 0) {
                System.out.println("Se ha alcanzado el límite de intentos. El programa se cerrará.");
                System.exit(0);
            }
        } while (pago <= 0);
        
        

    
        double tasaMensual = tasa / 12 / 100;

        
        if (pago < prestamo * tasaMensual) {
            System.out.println("El pago mensual es demasiado bajo y con este pago mensual la cantidad del préstamo no se podrá liquidar.");
        } else {
            int meses = 0;

            while (prestamo > 0) {
        
                double interes = prestamo * tasaMensual;
                double capital = pago - interes;
                prestamo = prestamo - capital;
                meses++;
            }

            System.out.println("El número de meses que tomará pagar el préstamo es: " + meses);
        }

        
        lector.close();
    }
}