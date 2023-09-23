import java.util.Scanner;

public class Ejercicio10{

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
       double a1,a2,porcentajeGrasa;
       double grasaCorporal;
        System.out.print("Ingrese su genero(f/m): ");
        char genero = lector.next().charAt(0); 
            int intentos = 3;
        if(genero == 'm'){
            while (intentos > 0) {
                System.out.print("Ingrese su peso corporal en kilogramos: ");
                double peso = lector.nextDouble();
                if (peso > 0) {
                    System.out.print("Ingrese la medida de su cintura en centímetros (mayor a cero):");
                    double medidaCintura = lector.nextDouble();
                    
                    if (medidaCintura > 0) {
                         a1 = (peso * 1.082) + 94.42;
                         a2 = medidaCintura * 4.15;
                         grasaCorporal = peso - (a1 - a2);
                         porcentajeGrasa = (grasaCorporal * 100) / peso;
                        
                        System.out.println("Su porcentaje de grasa corporal es: " + porcentajeGrasa+ "%");
                        return;
                    } else {
                        System.out.println("Medida de cintura no válida. Intente nuevamente.");
                    }
                } else {
                    System.out.println("Peso no válido. Intente nuevamente.");
                }
                
                intentos--;
                }
             }else if (genero == 'f') {
                while (intentos > 0) {
                    System.out.print("Ingrese su peso corporal en Kg:");
                    double peso = lector.nextDouble();
                    if (peso > 0) {
                        System.out.print("Ingrese la medida de su muñeca en cm: ");
                        double medidaMuñeca = lector.nextDouble();
                        
                     if (medidaMuñeca > 0) {
                            System.out.println("Ingrese la medida de su cintura en cm:");
                            double medidaCintura = lector.nextDouble();
                            
                     if (medidaCintura > 0) {
                                System.out.print("Ingrese la medida de su cadera en cm:");
                                double medidaCadera = lector.nextDouble();
                                
                    if (medidaCadera > 0) {
                 System.out.print("Ingrese la medida de su antebrazo en cm:");
                 double medidaAntebrazo = lector.nextDouble();
                                    
                    if (medidaAntebrazo > 0) {
                     a1 = (peso * 0.732) + 8.987;
                     a2 = medidaMuñeca / 3.140;
                     double a3 = medidaCintura * 0.157;
                     double a4 = medidaCadera * 0.249;
                     double a5 = medidaAntebrazo * 0.434;
                     double b = a1 + a2 - a3 - a4 + a5;
                     grasaCorporal = peso - b;
                    double porcentajeGrasaCorporal = (grasaCorporal * 100) / peso;
                                        
                    System.out.println("Tu porcentaje de grasa corporal es: " + porcentajeGrasaCorporal + "%");
                     
                      } else {
                      System.out.println("La medida del antebrazo debe ser mayor a cero.");
                      
                         }

                     } else {
                        System.out.println("La medida de la cadera debe ser mayor a cero.");
                      
                                }
                     } else {
                                System.out.println("La medida de la cintura debe ser mayor a cero.");
                                
                            }
                    } else {
                            System.out.println("La medida de la muñeca debe ser mayor a cero.");
                            
                        }
                    } else {
                        System.out.println("El peso corporal debe ser mayor a cero.");
                        
                    }
                    intentos--;
                }
             }
             
       lector.close(); 
    }
}