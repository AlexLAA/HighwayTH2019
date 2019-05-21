package lesson6;

/**
 * Created by lolik on 11.04.2019
 */
public class ArraysLoop {

    public static void main(String[] args) {
        int intArray[] = {1,2,3};

        intArray[0] = 5;
        intArray[1] = 2;
        intArray[2] = 7;


        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }


    }


}