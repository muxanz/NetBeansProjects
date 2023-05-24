/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej09;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int counter = 0;
        int input;
        int sum = 0;
        
        while (counter <= 19) {            
            
            System.out.print("Ingrese un numero: ");
            input = read.nextInt();
            
            if (input > 0) {
                sum += input;
            }
            
            if (input == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
               
            counter++;
            
        }
        
        System.out.println("La suma total de los numeros es: " + sum);
              
    }
    
}
