import Fruit.Fruit;
import Fruit.Apple;
import Fruit.Banana;

public class JavaClass {

    public static void main(String[] args) {

        System.out.println("调用Apple类Harvest 方法");
        Apple apple = new Apple();
        apple.harvest();

        System.out.println("调用Banana类Harvest 方法");
        Banana banana = new Banana();
        banana.harvest();

    }

}
