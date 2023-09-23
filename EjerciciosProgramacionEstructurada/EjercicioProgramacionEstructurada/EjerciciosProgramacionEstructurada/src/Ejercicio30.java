import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double precio;
        int intentos=3, opc;

        System.out.println("Bienvenido a McDonald's");
        System.out.println("Menú:");
        System.out.println("Combo 1: Hamburguesa Big Mac + Papas + Coca-Cola - $8.99");
        System.out.println("Combo 2: Hamburguesa Quarter Pounder + Nuggets + Sprite - $9.99");
        System.out.println("Combo 3: Cheeseburger + Papas + Agua - $6.99");
        System.out.println("Combo 4: Hamburguesa McChicken + Ensalada + Coca-Cola - $7.99");
        System.out.println("Combo 5: Hamburguesa Filet-O-Fish + Nuggets + Sprite - $8.49");
        System.out.println("Combo 6: Hamburguesa Cheeseburger + Papas + Agua - $6.99");
        System.out.println("Combo 7: Hamburguesa Big Mac + Sundae + Coca-Cola - $9.99");
        System.out.println("Combo 8: Hamburguesa Quarter Pounder + McFlurry + Sprite - $10.49");
        System.out.println("Combo 9: Cheeseburger + Apple Pie + Agua - $5.99");
        System.out.println("Combo 10: Hamburguesa McChicken + Ensalada + Agua - $7.49");
        System.out.println("11.Salir");
           do {
          System.out.print("Ingresa el combo que quiere agregar a la orden: ");
         opc = scanner.nextInt();
        
        if (opc <= 0 || opc > 11) {
            intentos--;
            System.out.println("Opción inválida. Intenta nuevamente.");
        }
        
        if (intentos <= 0) {
            System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
            return;
        }
        } while (opc <= 0 || opc > 11);
        

            switch (opc) {
                case 1:
                    precio = 8.99;
                    total += precio;
                    System.out.println("Combo 1 - Hamburguesa Big Mac + Papas + Coca-Cola agregado a la orden.");
                    break;
                case 2:
                    precio = 9.99;
                    total += precio;
                    System.out.println("Combo 2 - Hamburguesa Quarter Pounder + Nuggets + Sprite agregado a la orden.");
                    break;
                case 3:
                    precio = 6.99;
                    total += precio;
                    System.out.println("Combo 3 - Cheeseburger + Papas + Agua agregado a la orden.");
                    break;
                case 4:
                    precio = 7.99;
                    total += precio;
                    System.out.println("Combo 4 - Hamburguesa McChicken + Ensalada + Coca-Cola agregado a la orden.");
                    break;
                case 5:
                    precio = 8.49;
                    total += precio;
                    System.out.println("Combo 5 - Hamburguesa Filet-O-Fish + Nuggets + Sprite agregado a la orden.");
                    break;
                case 6:
                    precio = 6.99;
                    total += precio;
                    System.out.println("Combo 6 - Hamburguesa Cheeseburger + Papas + Agua agregado a la orden.");
                    break;
                case 7:
                    precio = 9.99;
                    total += precio;
                    System.out.println("Combo 7 - Hamburguesa Big Mac + Sundae + Coca-Cola agregado a la orden.");
                    break;
                case 8:
                    precio = 10.49;
                    total += precio;
                    System.out.println("Combo 8 - Hamburguesa Quarter Pounder + McFlurry + Sprite agregado a la orden.");
                    break;
                case 9:
                    precio = 5.99;
                    total += precio;
                    System.out.println("Combo 9 - Cheeseburger + Apple Pie + Agua agregado a la orden.");
                    break;
                case 10:
                    precio = 7.49;
                    total += precio;
                    System.out.println("Combo 10 - Hamburguesa McChicken + Ensalada + Agua agregado a la orden.");
                    break;
                 case 11:
                    System.out.println("Salir");
                    break;
            }
 
              System.out.println("Detalle de la factura:");
              System.out.println("Tipo de Cambio C$ 36");
              System.out.println("Total a pagar en: $" + total);
              System.out.println("Total a pagar en: C$" + total*36);
        
       
      
        scanner.close();
    }
}  
   