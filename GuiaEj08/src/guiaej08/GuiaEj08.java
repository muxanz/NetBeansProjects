/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej08;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la nota 0 - 10: ");
        int nota = read.nextInt();
        
        while (nota < 0 || nota > 10) {            
            System.out.print("Ingrese la nota 0 - 10: ");
            nota = read.nextInt();
        }
        
        System.out.println("Nota ingresada es: " + nota);
    }
    
}

