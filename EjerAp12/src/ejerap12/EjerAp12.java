package ejerap12;

import java.util.Scanner;

public class EjerAp12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("DISPOSITIVO RS232 -_-");

        int correct = 0;
        int incorrect = 0;

        while (true) {
            System.out.print("Envíe la secuencia... ");
            String sequence = read.next();

            if (sequence.length() == 5 && "X".equals(sequence.substring(0, 1)) && "O".equals(sequence.substring(5 - 1))) {
                correct++;
            } else if (sequence.equals("&&&&&")) {
                System.out.println("Secuencia de envíos finalizada.");
                break;
            } else {
                incorrect++;
            }

        }

        System.out.println("Secuencias correctas: " + correct);
        System.out.println("Secuencias incorrectas: " + incorrect);

    }

}
