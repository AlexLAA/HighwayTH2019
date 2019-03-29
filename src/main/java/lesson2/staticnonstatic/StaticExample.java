package lesson2.staticnonstatic;

/**
 * Created by lolik on 28.03.2019
 */
public class StaticExample {




    public static void main(String[] args) {

        User firstUser = new User();
        firstUser.name = "JACK";
        firstUser.age = 30;

        User secondUser = new User();
        secondUser.name = "Bob";
        secondUser.age = 25;

        System.out.println("FIRST USER Name: "+firstUser.name+" Age: "+firstUser.age +" Type: "+User.type);
        System.out.println("Second USER Name: "+secondUser.name+" Age: "+secondUser.age+" Type: "+User.type);

        User.type = "CAT";

        System.out.println("FIRST USER Name: "+firstUser.name+" Age: "+firstUser.age +" Type: "+User.type);
        System.out.println("Second USER Name: "+secondUser.name+" Age: "+secondUser.age+" Type: "+User.type);




    }





}
