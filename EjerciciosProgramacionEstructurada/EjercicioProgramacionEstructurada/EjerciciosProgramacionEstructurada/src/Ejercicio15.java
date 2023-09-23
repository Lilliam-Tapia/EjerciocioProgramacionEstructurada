import java.util.Scanner;
public class Ejercicio15{
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);
        int contador= 1;
        while (contador <= 3) {
        System.out.println("Empleado " + contador);
        System.out.print("Horas trabajadas: ");
        int horas = lector.nextInt();
        if (horas < 0) {
            System.out.println("Horas trabajadas inválidas.");
        }
        System.out.print("Sueldo por hora: ");
         double sueldo = lector.nextDouble();
        if (sueldo < 0) {
            System.out.println("Sueldo por hora inválida.");
        }
        lector.nextLine(); 

           double sueldoBruto;
            if(horas <= 40){
            sueldoBruto = horas*sueldo;
            }else{
            double horasN = 40*sueldo;
            double horasE = (horas-40)*(sueldo*1.5);
            sueldoBruto = horasN+horasE;
            System.out.println("Sueldo Bruto: C$"+sueldoBruto+"\n");
            contador++;
             }
        lector.close();
        }
    }
}