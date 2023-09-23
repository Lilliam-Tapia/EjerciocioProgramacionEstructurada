import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        double discriminante;
        System.out.print("Ingrese el valor de a(el coeficiente de x²): ");
         double a = lector.nextDouble();
         System.out.print("Ingrese el valor de b(el coeficiente de x): ");
         double b = lector.nextDouble();
         System.out.print("Ingrese el valor de c(el termino constante): ");
         double c = lector.nextDouble();
         discriminante = (a*a-4*a*c);
         if(discriminante > 0 ){

            double raiz1 = (-b+Math.sqrt(discriminante))/(2*a);
            double raiz2 = (-b-Math.sqrt(discriminante))/(2*a);
            System.out.println("La raices son reales y diferentes.");
            System.out.println("Raiz 1: "+raiz1);
            System.out.println("Raiz 2: "+raiz2);
            }else if(discriminante == 0){
                double raiz = -b/(2*a);
                System.out.println("La ecuacion tiene una sola raiz (repetida).");
                    System.out.println("Raiz: "+raiz);
            }else{
                double parteReal = -b/(2*a);
                double parteImaginaria = Math.sqrt(-discriminante)/(2*a);
                System.out.println("La raicea son complejas.");
                System.out.println("Raiz 1: "+parteReal+"+"+parteImaginaria+"¡");
                System.out.println("Raiz 2: "+parteReal+"+"+parteImaginaria+"¡");
                
                
            }
       
        
         lector.close();        
         
    }
}