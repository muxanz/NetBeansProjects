package ejerap07;
import java.util.Scanner;

public class EjerAp07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String text = read.nextLine();
        
        if (text.equals("eureka")) {
            System.out.println("Correcto :)");
        } else {
            System.out.println("Incorrecto :(");
        }
    }
    
}
