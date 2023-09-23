import java.util.Scanner;
import java.util.Random;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int intentos=3,coincidencias=0;
        int adivina1=0,adivina2=0,adivina3=0;

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);

       
        System.out.println("Bienvenido al juego de lotería.");
        while (intentos > 0) {
            System.out.print("Ingrese un número: ");
            adivina1 = lector.nextInt();

            if (adivina1 >= 0) {
                break;
            } else {
                intentos--;
                System.out.println("El número ingresado es negativo.");
            }
        }

        if (intentos == 0) {
            System.out.println("Se han agotado los intentos. El programa terminará.");
        }
        while (intentos > 0) {
            System.out.print("Ingrese un segundo número: ");
            adivina2 = lector.nextInt();

            if (adivina2 >= 0) {
                break;
            } else {
                intentos--;
                System.out.println("El número ingresado es negativo. ");
            }
        }

        if (intentos == 0) {
            System.out.println("Se han agotado los intentos. El programa terminará.");
        }
        while (intentos > 0) {
            System.out.print("Ingrese un número tercer: ");
            adivina3 = lector.nextInt();

            if (adivina3 >= 0) {
               
                break;
            } else {
                intentos--;
                System.out.println("El número ingresado es negativo. ");
            }
        }

        if (intentos == 0) {
            System.out.println("Se han agotado los intentos. El programa terminará.");
        }


        int premio = 0; 
        boolean coinciexacta = false; 
        if (adivina1 == num1 && adivina2 == num2 && adivina3 == num3) {
            premio = 1000000;
            coinciexacta = true;
        }
        else {
             coincidencias=0; 
        
            if (adivina1 == num1 || adivina1 == num2 || adivina1 == num3) {
                coincidencias++;
            }

            if (adivina2 == num1 || adivina2 == num2 || adivina2 == num3) {
                if (adivina2 != adivina1) {
                    coincidencias++;
                }
            }

            if (adivina3 == num1  || adivina3 == num2 || adivina3 == num3) {
                if (adivina3 != adivina1 && adivina3 != adivina2) {
                    coincidencias++;
                }
            }

            switch (coincidencias) {
                case 1: 
                    premio = 100;
                    break;
                case 2:
                    premio = 1000;
                    break;
                case 3: 
                    premio = 10000;
                    break;
                default: 
                    premio = 0;
                    break;
            }
        }
       
        System.out.println("Su suposición fue " + adivina1 + adivina2 + adivina3 + ".");
        System.out.println("El número generado al azar fue " + num1 + num2 + num3 + ".");
        if (coinciexacta) {
            System.out.println("¡Felicidades! Ha ganado C$" + premio + " por tener una coincidencia exacta.");
        }
        else {
            System.out.println("Ha ganado C$" + premio + " por tener " + coincidencias + " coincidencia(s) parcial(es).");
        }
        lector.close();
    }
}