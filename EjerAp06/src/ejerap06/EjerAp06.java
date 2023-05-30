package ejerap06;
import java.util.Scanner;
public class EjerAp06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = read.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
    }
    
}
