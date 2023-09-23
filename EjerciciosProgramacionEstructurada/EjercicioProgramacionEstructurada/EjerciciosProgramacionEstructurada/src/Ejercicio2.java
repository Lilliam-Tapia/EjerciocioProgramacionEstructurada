import java.util.Scanner;

public class Ejercicio2{

    public static void main(String []args){
        Scanner lector = new Scanner(System.in);
        int intentos=3;
        double lado1=0,lado2=0,lado3=0;

        for(int i=0;i<3;i++ ){
            do {
                 System.out.print("Ingrese la longitud del primer lado: ");
                  lado1 = lector.nextDouble();
                 if (lado1 <= 0) {
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
                System.out.print("Ingrese la longitud del segundo lado: ");
                lado2 = lector.nextDouble();
                 if (lado2 <= 0) {
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
                System.out.print("Ingrese la longitud del tercer lado: ");
                lado3 = lector.nextDouble();
                 if (lado3 <= 0) {
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
                if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
                    if (lado1 == lado2 && lado2 == lado3) {
                        System.out.println("Triángulo equilátero");
                        break;
                    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                        System.out.println("Triángulo isósceles");
                        break;
                    } else {
                        System.out.println("Triángulo escaleno");
                        break;
                    }
                } else {
                    System.out.println("No se puede formar un triángulo con los lados proporcionados.");
                }
            }
        lector.close();
    }
}
