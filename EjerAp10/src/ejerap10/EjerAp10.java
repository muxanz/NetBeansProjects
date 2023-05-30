package ejerap10;
import java.util.Scanner;

public class EjerAp10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese valor limite: ");
        int limit =  read.nextInt();
        int counter = 0;
        
        while (counter <= limit) {            
            System.out.print("Ingrese un número: ");
            int num = read.nextInt();
            
            counter += num;
        }
        
        System.out.println("Valor limite ingresado: " + limit + "\nSuma de valores ingresados: " + counter);
    }
    
}
