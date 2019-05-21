package lesson4.conditions;

import java.util.Scanner;

/**
 * Created by lolik on 04.04.2019
 */
public class IfElseExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print 'Jack Sparrow':");
        String input = scanner.nextLine();
        if(input.equals("Jack Sparrow")){
            System.out.println("Greetings, Captain!");
        } else {
            System.out.println("You are not Jack Sparrow!");
        }


    }

}
