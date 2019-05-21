package lesson7;

/**
 * Created by lolik on 18.04.2019
 */
public class StringsCompare {

    public static void main(String[] args) {
        String word1 = "JACK";
        String word2 = "SPARROW";
        System.out.println(word2.compareTo(word1));
    }

    private int isAdmin;

    public boolean getIsAdmin(){
        if(isAdmin == 0){
            return false;
        } else {
            return true;
        }
    }

    public void setIsAdmin(boolean isAdmin){
        if(isAdmin){
            this.isAdmin = 1;
        } else {
            this.isAdmin = 0;
        }
    }

}
