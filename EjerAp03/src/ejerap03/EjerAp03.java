package ejerap03;
import java.util.Scanner;
public class EjerAp03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String text = read.nextLine();
        
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
    
}
