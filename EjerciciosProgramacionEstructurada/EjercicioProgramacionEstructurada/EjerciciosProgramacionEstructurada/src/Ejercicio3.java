import java.util.Scanner;

public class Ejercicio3{
    
    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);
    int  Cajas= 24;
    int  cajasContenedor = 75;
    int rosquillas = 0;
    int intentos=3;
      while(intentos > 0 ){
      System.out.print("Ingrese la cantidad de rosquillas: ");
      rosquillas = lector.nextInt();
      if(rosquillas > 0 ){
        break;
      }else{
         intentos--;
        System.out.println("El numero de rosquillas mayor que cero.");
        }
      } 
     int  rosquillasCajas = (rosquillas / Cajas);
     int  rosquillasSobrantes = ( rosquillas % rosquillasCajas);
     int  Contenedores = (rosquillasCajas / cajasContenedor);
     int cajasSobrantes = rosquillasCajas % cajasContenedor;
    System.out.println("Numero de cajas necesarias: " +rosquillasCajas);
    System.out.println("Numero de rosquillas sobrantes: " +rosquillasSobrantes);
    System.out.println("Numero de contenedores: "+Contenedores);  
    System.out.println("Numero de cajas sobrantes: " +cajasSobrantes);                   
    
   
    lector.close();
   }
} 