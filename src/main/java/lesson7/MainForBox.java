package lesson7;

/**
 * Created by lolik on 18.04.2019
 */
public class MainForBox {


    public static void main(String[] args) {

        Box myBox = new Box(10, 10, 10);
        Box cube = new Box(10, 10, 10);
        Box parallelepiped = new Box(10, 20, 15);

        cube.setDim(10, 10, 10);
        parallelepiped.setDim(10, 20, 15);

        cube.getVolume();
        parallelepiped.getVolume();



        HeavyBox heavyBox = new HeavyBox();

        Box box = new HeavyBox();

    }
}
