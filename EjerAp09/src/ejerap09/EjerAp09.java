package ejerap09;
import java.util.Scanner;

public class EjerAp09 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese una frase o palabra: ");
        String text = read.nextLine();
        
//        System.out.println(text.substring(0, 1));
        if ("A".equals(text.substring(0, 1))) {
            System.out.println("Correcto :)");
        } else {
            System.out.println("Incorrecto :(");
        }
    }
    
}
