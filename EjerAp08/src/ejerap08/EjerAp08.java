package ejerap08;
import java.util.Scanner;

public class EjerAp08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese una frase o palabra (max 8 letras): ");
        String text = read.nextLine();
        
        if (text.length() == 8) {
            System.out.println("Correcto :)");
        } else {
            System.out.println("Incorrecto :(");
        }
    }
    
}