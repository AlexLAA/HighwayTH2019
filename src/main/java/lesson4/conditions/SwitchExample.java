package lesson4.conditions;

/**
 * Created by lolik on 04.04.2019
 */
public class SwitchExample {

    public static void main(String[] args) {

        String name = "Jack";

        switch (name){

            case "Jack":
                System.out.println("Daniels"); // break;

            case "NotJack":
                System.out.println("NOT DANIELS"); break;

            case "Alex":
                System.out.println("Hi Alex"); break;

            case "Max" :
                System.out.println("Pain"); break;

            default:
                System.out.println("I DON't have case for you ((");

        }

    }

}
