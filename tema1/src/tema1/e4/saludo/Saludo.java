
package t1.e4.saludo;

import java.util.Scanner;

/**
 *
 * @author JuliaMJ
 */
public class Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre.");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
    }
}
