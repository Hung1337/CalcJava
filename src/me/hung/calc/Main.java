/*
 * Hello c:
 */
package me.hung.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data in one line.\nExample: X+v");
        Calculate calc = new Calculate(scanner.nextLine());
        

    }

}
