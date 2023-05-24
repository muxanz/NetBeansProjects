/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej10;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        
        int counter = 0;
        
        while (counter < 4) {   
            
            System.out.print("Ingresa un numero: ");
            int num = read.nextInt();
            System.out.println("\n");

            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                System.out.print("*"); 
            }
            System.out.println("\n");
            counter++;
        } 
        
    }
    
}
