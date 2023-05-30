package ejerap05;
import java.util.Scanner;
public class EjerAp05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = read.nextInt();
        
        int doubleNum = num * 2;
        int tripleNum = num * 3;
        int squareNum = (int) Math.sqrt(num);
        
        System.out.println("Número ingresado " + num + "\nEl doble es: " + doubleNum + "\nEl triple es: " + tripleNum + "\nSu raiz cuadrade es: " + squareNum);
    }
    
}
