package lesson7;

/**
 * Created by lolik on 14.05.2019
 */
public class HeavyBox extends Box {

    int weight; // вес коробки

    public HeavyBox(int width, int height, int depth, int weight){
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox(){
        weight = 20;
    }


    public void printInfo(){

        System.out.println("Объем коробки: "+getVolume());
        System.out.println("Вес коробки: "+weight);
    }

    public void asdasd(){
        super.printInfo();
    }


}
