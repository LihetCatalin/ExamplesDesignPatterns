import CarModel.Car;
import Factories.F1CarFactory;
import Factories.FerrariFactory;
import Factories.MercedesFactory;
import Factories.RedBullFactory;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        F1CarFactory factory = new FerrariFactory();
        Car c1 = new Car(factory);
        c1.testCar();

        System.out.println("---------------------------------------");
        factory = new MercedesFactory();
        Car c2 = new Car(factory);
        c2.testCar();

        System.out.println("---------------------------------------");
        factory = new RedBullFactory();
        Car c3 = new Car(factory);
        c3.testCar();
    }
}