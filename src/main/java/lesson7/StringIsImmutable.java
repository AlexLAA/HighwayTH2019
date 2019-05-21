package lesson7;

/**
 * Created by lolik on 18.04.2019
 */
public class StringIsImmutable {


    public static void main(String[] args) {

        String myDoubleString = "29.30";
        double d = Double.valueOf(myDoubleString);
        System.out.println(d);


        String myString = "JACK";
        myString.concat(" SPARROW"); // "JACK" + " SPARROW"
        System.out.println(myString); // JACK
        //метод concat возвращает новую строку - ОН НЕ ИЗМЕНЯЕТ ОБЪЕКТ
        myString = myString.concat(" SPARROW"); // myString = "JACK" + " SPARROW"
        System.out.println(myString); // JACK SPARROW
    }
}
