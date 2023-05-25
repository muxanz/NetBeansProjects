/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej12;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros: ");
        int numA = read.nextInt();
        int numB = read.nextInt();
        
        isMultiple(numA, numB);
    }
    
    public static void isMultiple (int numA, int numB) {
        if (numA % numB == 0) {
            System.out.println(numA + " es multiplo de " + numB);
        } else {
            System.out.println(numA + " no es multiplo de " + numB);
        }
    } 
}
