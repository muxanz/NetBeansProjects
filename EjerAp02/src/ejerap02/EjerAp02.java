package ejerap02;
import java.util.Scanner;
public class EjerAp02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Cúal es tu nombre? ");
        String name = read.nextLine();
                       
        System.out.println("Hola " + name);
    }
    
}