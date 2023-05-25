/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej11;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();
             
        String modText = vowels(text);
        
        System.out.println(modText);  
        
    }
    
    public static String vowels (String text) {
        
        String newText = text.replace('A', '@').replace('a', '@').replace('E', '#').replace('e', '#').replace('I', '$').replace('i', '$').replace('O', '%').replace('o', '%').replace('U', '*').replace('u', '*');
        
        return newText;   
    
    }
    
}




