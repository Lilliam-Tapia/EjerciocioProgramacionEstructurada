import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese tres palabras:");
        String palabras = lector.nextLine().trim();
        
        String[] palabrasSeparadas = palabras.split(" ");
        int cantidadPalabras = palabrasSeparadas.length;
        
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        
        if (cantidadPalabras >= 1) {
            palabra1 = palabrasSeparadas[0];
        }
        if (cantidadPalabras >= 2) {
            palabra2 = palabrasSeparadas[1];
        }
        if (cantidadPalabras >= 3) {
            palabra3 = palabrasSeparadas[2];
        }
        
        String acronimo = generarAcronimo(palabra1, palabra2, palabra3);
        System.out.println("El acrónimo es: " + acronimo);
    }
    
    public static String generarAcronimo(String palabra1, String palabra2, String palabra3) {
        StringBuilder acronimoBuilder = new StringBuilder();
        
        acronimoBuilder.append(palabra1.charAt(0));
        acronimoBuilder.append(palabra2.charAt(0));
        acronimoBuilder.append(palabra3.charAt(0));
        
        return acronimoBuilder.toString().toUpperCase(); 
    }
}