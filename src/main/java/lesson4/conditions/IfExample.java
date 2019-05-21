package lesson4.conditions;

import java.util.Scanner;

/**
 * Created by lolik on 04.04.2019
 */
public class IfExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your int number: ");
        int inputInt = scanner.nextInt();
        if(inputInt == 300){
            System.out.println("Joke about the tractor driver");
        }
        System.out.println("Your int is "+inputInt);

    }

}
