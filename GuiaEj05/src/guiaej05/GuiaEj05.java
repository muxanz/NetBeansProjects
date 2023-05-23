/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej05;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingresa boolean: ");
        boolean bol = read.nextBoolean();
        
        System.out.print("Ingresa double: ");
        double dou = read.nextDouble();
        
        System.out.print("Ingresa caracter: ");
        char cha = read.next().charAt(1);
        
        System.out.println(bol);
        System.out.println(dou);
        System.out.println(cha);
        
        
//        System.out.print("Ingresa tu nombre: ");
//        String name = read.nextLine();
//        
//        System.out.print("Ingresa tu edad: ");
//        int age = read.nextInt();
//        
//        System.out.println("Tu nombre es: " + name);
//        System.out.println("Tienes " + age + " años");
        
        
    }
    
}