package ejerap13;
import java.util.Scanner;

public class EjerAp13 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese un valor: ");
        int value = read.nextInt();
        
        for (int i = 0; i < value; i++) {
           
            
            for (int j = 0; j < value; j++) {
                
                if (i == 0 || i == value-1 || j == 0 || j == value-1) {
                    System.out.print("* ");
                    
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println("");
            
        }
        
    }
    
}