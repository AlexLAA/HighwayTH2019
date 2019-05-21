package lesson4;

/**
 * Created by lolik on 04.04.2019
 */
public class LogicalOperators {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        boolean result;

        result = a==b; // a равно b
        System.out.println("a==b (а equals b) : "+result);

        result = a!=b; // a не равно b
        System.out.println("a!=b (а NOT equals b) : "+result);

        result = a<b; // a меньше b
        System.out.println("a<b (а less b) : "+result);

        result = a>b; // a больше b
        System.out.println("a>b (а more b) : "+result);

        result = a<=b; // a меньше или равно b
        System.out.println("a<=b (а less or equals b) : "+result);

        result = a>=b; // a больше или равно b
        System.out.println("a>=b (а more or equals b) : "+result);


    }

}
