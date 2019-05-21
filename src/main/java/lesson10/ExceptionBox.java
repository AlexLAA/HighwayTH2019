package lesson10;

import lesson7.Box;

/**
 * Created by lolik on 16.05.2019
 */
public class ExceptionBox {

    static Box box;

    public static void makeSomeMagic() {
        if(box == null){
            throw new NullPointerException("BOX не инициализирован!");
        }
    }

    public static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    public static void main(String[] args) {
        getSurname("Jack Sparrow");
    }

    public static String getSurname(String nameAndSurname){
        String surname = nameAndSurname.split(" ")[1];
        try {
            return surname;
        } finally {
            System.out.println(surname);
        }
    }


}
