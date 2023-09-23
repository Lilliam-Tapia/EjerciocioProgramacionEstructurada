import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos =1;
        System.out.print("Introduce el año que quieres mostrar (entre 1994 y 1999): ");
        int año = lector.nextInt();

        
     while ((año < 1994 || año > 1999) && intentos < 3) {
     System.out.println("El año debe estar entre 1994 y 1999: ");
      System.out.println("Introduce otro año");
     año = lector.nextInt();
     intentos++;
     }
     if (año >= 1994 && año <= 1999) {
    } else {
    System.out.println("Se excedió la cantidad de intentos permitidos");
    return;
    }
 
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, año);
        
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] dias = {"Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"};
        
        System.out.println("Calendario del año " + año);
        
        for (int mes = 0; mes < 12; mes++) {
            calendario.set(Calendar.MONTH, mes);
            int primerDia = calendario.get(Calendar.DAY_OF_WEEK) - 1;
            int diasMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("\n" + meses[mes]);
            
            for (int i = 0; i < 7; i++) {
                System.out.print(dias[i] + "\t");
            }
            System.out.println();
            
            for (int i = 0; i < primerDia; i++) {
                System.out.print("\t");
            }
            
            for (int i = 1; i <= diasMes; i++) {
                System.out.print(i + "\t");
                if ((primerDia + i) % 7 == 0) {
                    System.out.println();
                }
            }
        }
        
        lector.close();
    }
}