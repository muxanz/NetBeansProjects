/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaej14;
import java.util.Scanner;
/**
 *
 * @author muxan
 */
public class GuiaEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String[] team = new String[5];
        
        int counter = 0;
        
        while (counter < team.length) {            
            System.out.print("Ingrese persona " + (counter + 1) + ": ");
            String name = read.nextLine();
            
            team[counter] = name;
            
            counter++;
        }
        
        for (int i = 0; i < team.length; i++) {
            System.out.println("Persona " + (i + 1) + " " + team[i]);
        }
    }
    
}
