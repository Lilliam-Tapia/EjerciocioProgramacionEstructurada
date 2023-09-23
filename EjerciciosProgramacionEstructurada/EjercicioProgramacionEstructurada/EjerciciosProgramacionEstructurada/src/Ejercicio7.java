import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         int intentos=3;
         int numeroCuenta,minutosDia,minutosNoche;
        do {
            System.out.print("Ingrese el número de cuenta: ");
            numeroCuenta = lector.nextInt();
  
            if (numeroCuenta <= 0) {
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
        System.out.print("Ingrese el código de servicio (R o P): ");
        char codigoServicio = lector.next().charAt(0);

   
        String tipoServicio = "";
        int minutosUsados = 0;
        double montoPagar = 0.0;
 
        if (codigoServicio == 'R' || codigoServicio == 'r') {
            tipoServicio = "Regular";
            do {
             System.out.print("Ingrese los minutos usados: ");
             minutosUsados = lector.nextInt();
            if (minutosUsados <= 0) {
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

            montoPagar = 10.0; 
            if (minutosUsados > 50) {
                  montoPagar += (minutosUsados - 50) * 0.2;
            }
        } else if (codigoServicio == 'P' || codigoServicio == 'p') {
            tipoServicio = "Premium";
            
             do {
              System.out.print("Ingrese los minutos usados durante el día (6:00 a.m. a 6:00 p.m.): ");
              minutosDia = lector.nextInt();
            if (minutosDia <= 0) {
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
         do {
              System.out.print("Ingrese los minutos usados durante la noche (6:00 p.m. a 6:00 a.m.): ");
            minutosNoche = lector.nextInt();
            if (minutosNoche <= 0) {
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
         

            montoPagar = 25.0; 
            if (minutosDia > 75) {
                montoPagar += (minutosDia - 75) * 0.1;
            }
            if (minutosNoche > 100) {
                montoPagar += (minutosNoche - 100) * 0.05;
            }

            minutosUsados = minutosDia + minutosNoche;
        } else {
          
            System.out.println("Código de servicio inválido. Por favor, ingrese R o P.");
            return; 
        }

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de servicio: " + tipoServicio);
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.printf("Monto a pagar: U$%.2f\n", montoPagar);
        lector.close();
    }
}