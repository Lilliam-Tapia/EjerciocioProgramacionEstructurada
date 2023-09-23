import java.util.Scanner;
public class Ejercicio14{
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        int CantIntentos=0;
        int TKilometros=0;
        int Tlitros=0;

        while(CantIntentos < 3){
            System.out.print("Ingrese la cantidad de Km conducidos en el viaje:");
            int Kilometros = lector.nextInt();
            if(Kilometros < 0){
                System.out.print("El numero de Km no puede ser negativo.");
                CantIntentos++;
                continue;
            }
            System.out.print("Ingresa los litros de combustible usados: ");
            int  litros = lector.nextInt();
            if(litros < 0){
                System.out.println("El numero de litros de combustible no puede ser negativo.");
               CantIntentos++;
               continue;
            }
            double kmporLitro = (double) Kilometros/litros;
            System.out.println("Km por litros por litro en este viaje: "+kmporLitro);
            TKilometros += Kilometros;
            Tlitros += litros;
            
            double promedioKmPorLitros = (double) TKilometros/Tlitros;
            System.out.println("Km por litro promedio en este momento: "+promedioKmPorLitros);
            CantIntentos = 0;
        }
        System.out.println("Haz alcanzado el limite de intentos");
        lector.close();
    }
}