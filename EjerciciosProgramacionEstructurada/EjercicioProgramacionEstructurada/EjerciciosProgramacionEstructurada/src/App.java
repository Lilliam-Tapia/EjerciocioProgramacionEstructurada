import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

      System.out.print("Ingrese su edad: ");
      byte edad = lector.nextByte(); 
      if(edad < 18){
            System.out.print("Es menor de edad no puede pasar");
            System.exit(0);
            }
        for(int i = 0; i<3; i++ ){
        System.out.print("Ingrese su genero(f/m): ");
        char genero = lector.next().charAt(0);         
        if(genero == 'f'){
        if(edad <= 20){
            System.out.println("Bienvenida puede pasar y consumir bebidas alcoholica.");
        }else{
            System.out.println("Bienvenida puedes pasar pero no consumir bebidas alcoholicas");
        }
       }else if(genero == 'm'){
        System.out.print("Porta armas?(s/n)");
        char res = lector.next().charAt(0);
        if(res == 's'){
            System.out.println("No se permite portar armas en el local");
        }else if(edad <= 20  ){
          System.out.println("Bienvenido puede pasar pero no tomar bebidas alcoholicas");
        }else{
          System.out.println("Bienvenido puede pasar y tomar bebidas alcoholicas.");
        }
        }else{
          System.out.println("Opcion invalida.Verifique lo que introdujo");
        }
      }  
        lector.close();

    
    }
}