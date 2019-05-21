package lesson4.conditions;

import java.util.Scanner;

/**
 * Created by lolik on 04.04.2019
 */
public class IfElseIfElseIfExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - print Jack");
        System.out.println("2 - print Biber");
        System.out.println("3 - print Hulk");
        System.out.println("4 - print Obama");
        System.out.println("5 - print Putin");
        System.out.println("6 - print Zelenskiy");
        System.out.println("7 - print Poroshenko");
        System.out.println("Select number: ");

        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Jack Daniels");
        } else if(choice == 2){
            System.out.println("Justin Bieber despasito");
        } else if(choice == 3){
            System.out.println("Hulk is here!");
        } else if(choice == 4){
            System.out.println("Yes we can!");
        } else if(choice == 5){
            System.out.println("Krem nash");
        } else if(choice == 6){
            System.out.println("Ze Dratute");
        } else if(choice == 7){
            System.out.println("Take some candies");
        } else {
            System.out.println("No such number in menu");
        }

    }
}
