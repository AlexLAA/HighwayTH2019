package lesson2;

/**
 * Created by lolik on 28.03.2019
 */
public class VoidExample {

    public static void print(){
        System.out.println("VOID METHOD: Hello, World!");
    }

    public static String getPhrase(){
        return "Hello, World!";
    }

    public static double getPi(){
        return 3.14159265;
    }


    public static void main(String[] args) {
        print();
        String phrase = getPhrase();
        System.out.println(phrase);
        System.out.println("PI: "+getPi());
    }


}
