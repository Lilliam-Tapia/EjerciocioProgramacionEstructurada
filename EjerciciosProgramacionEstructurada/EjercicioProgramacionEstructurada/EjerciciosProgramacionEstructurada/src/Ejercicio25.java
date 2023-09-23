import java.util.Scanner;
public class Ejercicio25{
    public static void main(String [] args ){
        Scanner lector = new Scanner(System.in);
        String contraseña;
        String confirmacionContraseña;
        
        while (true) {
            System.out.print("Ingrese una contraseña: ");
            contraseña = lector.nextLine();
            
            if (contraseña.length() < 6 || contraseña.length() > 10) {
                System.out.println("La contraseña debe tener entre 6 y 10 caracteres.");
                continue; 
            }
            
            boolean contieneLetra = false;
            boolean contieneDigito = false;
            
            for (int i = 0; i < contraseña.length(); i++) {
                char caracter = contraseña.charAt(i);
                
                if ((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z')) {
                    contieneLetra = true;
                }
                
                if (caracter >= '0' && caracter <= '9') {
                    contieneDigito = true;
                }
                
                if (contieneLetra && contieneDigito) {
                    break; 
                }
            }
            
            if (!contieneLetra || !contieneDigito) {
                System.out.println("La contraseña debe contener al menos una letra y un dígito.");
                continue; 
            }
            
            break; 
            }
        
        while (true) {
            System.out.print("Confirme la contraseña: ");
            confirmacionContraseña = lector.nextLine();
            
            if (!confirmacionContraseña.equals(contraseña)) {
                System.out.println("Las contraseñas no coinciden. Inténtelo nuevamente.");
                continue;
            }
            
            break;
        }
        
        System.out.println("Contraseña establecida correctamente.");
        lector.close();
    
    }
}