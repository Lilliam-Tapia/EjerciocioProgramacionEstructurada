import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        long cuenta = 1;
        long millon = 1;

        while (cuenta <= 300_000_000) {
            if (cuenta % 1_000_000 == 0) {
                System.out.println("Múltiplo de 1,000,000: " + cuenta);
                long tiempoTranscurrido = System.currentTimeMillis() - inicio;
                System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " milisegundos");
                inicio = System.currentTimeMillis();
                millon++;
            }
            cuenta++;
        }
       
    }
}
