package lesson10;

import java.util.Scanner;

/**
 * Created by lolik on 16.05.2019
 */
public class ExceptionMultiplyCatch {

    public static void main(String[] args) {
        int[] m = {-1,0,1};
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            m[a] = 4/a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) { // перехват 1
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) { // перехват 2
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (Exception e) { // перехват 3
            System.out.println("Произошло ещё какое-то исключение");
        }
    }


}
