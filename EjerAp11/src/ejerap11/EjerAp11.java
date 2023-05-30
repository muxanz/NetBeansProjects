package ejerap11;
import java.util.Scanner;

public class EjerAp11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese primer número: ");
        int numA = read.nextInt();
        System.out.print("Ingrese segundo número: ");
        int numB = read.nextInt();
        
        int option;
        boolean exit = false;
        
        do {
            System.out.print("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija una opción: "
            );
            
            option = read.nextInt();
            
            switch(option) {
                case 1:
                    int result = numA + numB;
                    System.out.println("La suma de los números es: " + result);
                    break;
                case 2:
                    result = numA - numB;
                    System.out.println("La resta de los números es: " + result);
                    break;
                case 3:
                    result = numA * numB;
                    System.out.println("La multiplicación de los números es: " + result);
                    break;
                case 4:
                    result = numA / numB;
                    System.out.println("La división de los números es: " + result);
                    break;
                    
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String option2 = read.next();
                    if (option2.equals("S")) {
                        exit = true;
                    }
                    break;
                default:
                    System.out.println("Opción no válida, ingrese un valor entre 1 - 5...");
                    
            }
            
        } while (!exit);
                   
    }
         
}
