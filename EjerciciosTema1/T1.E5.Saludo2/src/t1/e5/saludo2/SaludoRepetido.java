package t1.e5.saludo2;

import java.util.Scanner;

/**
 *
 * @author JuliaMJ
 */
public class SaludoRepetido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una palabra: ");
        String palabra = sc.nextLine();
        
        System.out.println("Dime un número: ");
        int numero = sc.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }
    }
}
