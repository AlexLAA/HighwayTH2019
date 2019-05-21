package lesson7;

/**
 * Created by lolik on 18.04.2019
 */
public class Box {

    protected double width; // ширина
    public double height; // высота
    public double depth; // глубина


    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(){

    }


    public double getVolume()  {
        return width * height * depth;
    }

    public void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    public void printInfo(){
        System.out.println("Объем коробки: "+getVolume());
    }


}
