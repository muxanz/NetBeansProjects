package ejerap01;
import java.util.Scanner;
public class EjerAp01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numA = read.nextInt();
        System.out.print("Ingrese otro número: ");
        int numB = read.nextInt();
        
        int result = numA + numB;
       
        System.out.println("La suma de " + numA + " y " + numB + " es " + result);
    }
    
}
