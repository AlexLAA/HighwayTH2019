package lesson1;

import java.util.Scanner;

/**
 * Created by lolik on 26.03.2019
 */
public class HelloUserConsoleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = scanner.nextLine();
        System.out.println("Greetings, "+s+"!");
    }
}
