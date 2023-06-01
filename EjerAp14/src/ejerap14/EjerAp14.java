package ejerap14;
import java.util.Scanner;

public class EjerAp14 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de Euros (Є) a convertir: ");
        float amount = read.nextFloat();
        System.out.println("Convertir a: \n1. Libras esterlinas(£)\n2. Dólares($)\n3. Yenes(¥)");
        int currency = read.nextInt();
        
        currencyConverter(amount, currency);
    }
    
    
    public static void currencyConverter(float amount, int currency) {
        
        switch(currency) {
            case 1:
                System.out.println(amount + " Euro(s) son " + (amount * 0.86) + " Libras esterlinas.");
                break;
            case 2:
                System.out.println(amount + " Euro(s) son " + (amount * 1.28611) + " Dólares.");
                break;
            case 3:
                System.out.println(amount + " Euro(s) son " + (amount * 129.852) + " Yenes.");
                break;
            default:
                System.out.println("Moneda no encontrada!");    
        
        }
    }
    
}
