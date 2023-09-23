import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3;
        int saldoInicial,creditos;
        int limiteCredito,cargos;
        do {
            System.out.print("Ingrese el numero de cuenta: ");
            int numcuenta = lector.nextInt();
  
            if (numcuenta <= 0) {
                System.out.println("El numero de cuenta debe ser mayor a cero. Intente nuevamente.");
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
                System.out.print("Ingrese el Saldo Inicial del mes: ");
                saldoInicial = lector.nextInt();
  
                if (saldoInicial <= 0) {
                    System.out.println("El Saldo inicial debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
              } while (intentos > 0);
  
             if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                return;
              }
          
               do {
            System.out.print("Ingrese el total de articulos cargados por el cliente en el mes: ");
             cargos = lector.nextInt();
  
            if (cargos <= 0) {
                System.out.println("El total de articulos cargados debe ser mayor a cero. Intente nuevamente.");
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
            System.out.print("Ingrese el total de de creditos aplicados a la cuenta del cliente en el mes: ");
            creditos = lector.nextInt();
  
            if (creditos <= 0) {
                System.out.println("El total de creditos aplicados debe ser mayor a cero. Intente nuevamente.");
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
                System.out.print("Ingrese el numero de credito permitido: ");
                limiteCredito = lector.nextInt();
  
                if (limiteCredito <= 0) {
                    System.out.println("El Saldo inicial debe ser mayor a cero. Intente nuevamente.");
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
            
            int nuevoSaldo = saldoInicial + cargos - creditos;

            if (nuevoSaldo > limiteCredito) {
                System.out.println("Se excedió el límite de su crédito");
            } else {
                System.out.println("El nuevo saldo es: " + nuevoSaldo);
            }

            intentos++;
        }
       }
        lector.close();
    }
}