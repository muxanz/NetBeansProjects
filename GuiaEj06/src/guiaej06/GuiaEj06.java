/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej06;
import java.util.Scanner;

/**
 *
 * @author muxan
 */
public class GuiaEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int numA = read.nextInt();
        
        System.out.print("Ingresa otro numero: ");
        int numB = read.nextInt();
        
        if (numA > 25 && numB > 25) {
            System.out.println(numA + " y " + numB + " ambos son mayores que 25.");
        } else if (numA > 25 && numB < 25) {
            System.out.println(numA + " es mayor que 25.");
        } else if (numA < 25 && numB > 25) {
            System.out.println(numB + " es mayor que 25.");
        } else {
            System.out.println(numA + " y " + numB + " ambos son menores que 25.");
        }
    }
    
}
