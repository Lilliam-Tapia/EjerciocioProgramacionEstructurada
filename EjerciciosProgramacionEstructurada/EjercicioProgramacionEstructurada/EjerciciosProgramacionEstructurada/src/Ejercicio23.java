import java.util.Scanner;
public class Ejercicio23{

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3,opc;
        boolean continuar = true;
            while(continuar){
            System.out.print("Ingrese la dimensión de los vectores (2D o 3D):");
            int dimension = lector.nextInt();

            double v1x, v1y, v1z;
            double v2x, v2y, v2z;

            System.out.print("Ingrese las coordenadas del primer vector x:");
            v1x = lector.nextDouble();
            System.out.print("Ingrese las coordenadas del primer vector y:");
            v1y = lector.nextDouble();
            if (dimension == 3) {
                  System.out.print("Ingrese las coordenadas del primer vector z:");
                v1z = lector.nextDouble();
            } else {
                v1z = 0;
            }

            System.out.print("Ingrese las coordenadas del segundo vector x:");
            v2x = lector.nextDouble();
            System.out.print("Ingrese las coordenadas del segundo vector y:");
            v2y = lector.nextDouble();
            if (dimension == 3) {
                 System.out.print("Ingrese las coordenadas del segundo vector z:");
                v2z = lector.nextDouble();
            } else {
                v2z = 0;
            }

            System.out.println("Ingrese la operación que desea realizar:");
            System.out.println("1. Suma de vectores");
            System.out.println("2. Resta de vectores");
            System.out.println("3. Opuesto de un vector");
            System.out.println("4. Producto de un escalar por un vector");
            System.out.println("5. Producto punto (escalar) entre vectores");
            System.out.println("6. Determinar si son vectores paralelos");
            System.out.println("7. Determinar si son vectores ortogonales");
            System.out.println("8. Determinar la proyección de un vector sobre otro vector");
            System.out.println("9. Producto vectorial (cruz) entre vectores");
            System.out.println("10.Salir");
        
            do {
                System.out.print("Ingresa una opción: ");
                opc = lector.nextInt();
                
                if (opc <= 0 || opc > 10) {
                    intentos--;
                    System.out.println("Opción inválida. Intenta nuevamente.");
                }
                
                if (intentos <= 0) {
                    System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
                    return;
                }
               } while (opc <= 0 || opc > 10);

            switch (opc) {
                case 1:
                    double sumaX = v1x + v2x;
                    double sumaY = v1y + v2y;
                    double sumaZ = v1z + v2z;
                    System.out.println("La suma de los vectores es: (" + sumaX + ", " + sumaY + ", " + sumaZ + ")");
                    break;
                case 2:
                    double restaX = v1x - v2x;
                    double restaY = v1y - v2y;
                    double restaZ = v1z - v2z;
                    System.out.println("La resta de los vectores es: (" + restaX + ", " + restaY + ", " + restaZ + ")");
                    break;
                case 3:
                    double opuestoX = -v1x;
                    double opuestoY = -v1y;
                    double opuestoZ = -v1z;
                    System.out.println("El opuesto del vector es: (" + opuestoX + ", " + opuestoY + ", " + opuestoZ + ")");
                    break;
                case 4:
                    System.out.print("Ingrese el escalar:");
                    double escalar = lector.nextDouble();
                    double productoEscalarX = escalar * v1x;
                    double productoEscalarY = escalar * v1y;
                    double productoEscalarZ = escalar * v1z;
                    System.out.println("El producto del escalar por el vector es: (" + productoEscalarX + ", " + productoEscalarY + ", " + productoEscalarZ + ")");
                    break;
                case 5:
                    double productoPunto = v1x * v2x + v1y * v2y + v1z * v2z;
                    System.out.println("El producto punto entre los vectores es: " + productoPunto);
                    break;
                case 6:
                    boolean paralelos = (v1x / v2x == v1y / v2y) && (v1y / v2y == v1z / v2z);
                    System.out.println("Los vectores son paralelos: " + paralelos);
                    break;
                case 7:
                    boolean ortogonales = (v1x * v2x + v1y * v2y + v1z * v2z) == 0;
                    System.out.println("Los vectores son ortogonales: " + ortogonales);
                    break;
                case 8:
                    double proyeccionX = (v1x * v2x + v1y * v2y + v1z * v2z) / (v2x * v2x + v2y * v2y + v2z * v2z) * v2x;
                    double proyeccionY = (v1x * v2x + v1y * v2y + v1z * v2z) / (v2x * v2x + v2y * v2y + v2z * v2z) * v2y;
                    double proyeccionZ = (v1x * v2x + v1y * v2y + v1z * v2z) / (v2x * v2x + v2y * v2y + v2z * v2z) * v2z;
                    System.out.println("La proyección del vector sobre otro vector es: (" + proyeccionX + ", " + proyeccionY + ", " + proyeccionZ + ")");
                    break;
                case 9:
                    if (dimension != 3) {
                        System.out.println("Error: el producto vectorial solo está definido para vectores tridimensionales.");
                        break;
                    }
                    double productoCruzX = v1y * v2z - v1z * v2y;
                    double productoCruzY = v1z * v2x - v1x * v2z;
                    double productoCruzZ = v1x * v2y - v1y * v2x;
                    System.out.println("El producto vectorial entre los vectores es: (" + productoCruzX + ", " + productoCruzY + ", " + productoCruzZ + ")");
                    break;
                case 10:
                System.out.println("Usted ha decidido salir de este programa.");
                break;
            }

            System.out.print("¿Desea continuar? (S/N)");
            String respuesta = lector.next();
          }
          lector.close();
      }  
}