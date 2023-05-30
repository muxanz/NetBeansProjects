package ejerap04;
import java.util.Scanner;

public class EjerAp04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese los grados C: ");
        float degrees = read.nextFloat();
        
        float toFahrenheit = 32 + (9 * degrees / 5);
        
        System.out.println(degrees + " Centígrados a Fahrenheit son " + toFahrenheit);
    }
    
}
