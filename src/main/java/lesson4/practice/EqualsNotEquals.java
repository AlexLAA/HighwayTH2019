package lesson4.practice;

/**
 * Created by lolik on 04.04.2019
 */
public class EqualsNotEquals {

    public static void main(String[] args) {
        String str1 = new String("Привет");
        String str2 = new String("Привет");
        String sameStr = str1;

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == sameStr);
    }
}
