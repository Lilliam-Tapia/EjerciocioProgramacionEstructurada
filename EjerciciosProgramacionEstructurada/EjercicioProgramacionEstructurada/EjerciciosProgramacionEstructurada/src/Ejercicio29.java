import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
      
        Scanner lector = new Scanner(System.in);
        int intentos=3;
        int residencia, horas;
       
        System.out.println("¿En qué tipo de residencia vive?");
        System.out.println("1. Apartamento");
        System.out.println("2. Casa");
        System.out.println("3. Dormitorio");
        System.out.println("4.Salir.");
          
       do {
        System.out.print("Ingresa una opción: ");
        residencia = lector.nextInt();
        
        if (residencia <= 0 || residencia > 4) {
            intentos--;
            System.out.println("Opción inválida. Intenta nuevamente.");
        }
        
        if (intentos <= 0) {
            System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
            return;
        }
       } while (residencia <= 0 || residencia > 4);

    
        System.out.println("¿Cuántas horas está en casa durante el día promedio?");
        System.out.println("1. 6-7");
        System.out.println("2. 18 o más");
        System.out.println("3. 10-17");
        System.out.println("4. 8-9");
        System.out.println("5. 0-5");
             
       do {
        System.out.print("Ingresa una opción: ");
        horas = lector.nextInt();
        
        if (horas <= 0 || horas > 5) {
            intentos--;
            System.out.println("Opción inválida. Intenta nuevamente.");
        }
        
        if (intentos <= 0) {
            System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
            return;
        }
       } while (horas <= 0 || horas > 5);
       

        
        String recomendacion = "";

        
        switch (residencia) {
            case 1: 
                switch (horas) {
                    case 3: 
                        recomendacion = "Gato";
                        break;
                    case 4: 
                        recomendacion = "Gato";
                        break;
                    default: 
                        recomendacion = "Hamster";
                        break;
                }
                break;
            case 2: 
                switch (horas) {
                    case 2: 
                        recomendacion = "Cerdo barrigón";
                        break;
                    case 3: 
                        recomendacion = "Perro";
                        break;
                    default: 
                        recomendacion = "Serpiente";
                        break;
                }
                break;
            case 3: 
                switch (horas) {
                    case 1: 
                        recomendacion = "Pez";
                        break;
                    default: 
                        recomendacion = "Granja de hormigas";
                        break;
                }
                break;
            case 4:
                   System.out.println("Ha decidido salir del programa.");
                break;
        }
        System.out.println("La mascota que le recomiendo es: " + recomendacion);
        lector.close();
    }
}