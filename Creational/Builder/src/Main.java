import BuilderRelated.Director;
import BuilderRelated.HouseBuilder;
import HouseRelated.House;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.constructWoodenHouse(builder);
        House house1 = builder.getProduct();

        director.constructStoneHouse(builder);
        House house2 = builder.getProduct();

        director.constructMansion(builder);
        House house3 = builder.getProduct();

        System.out.println(house1.printData());
        System.out.println("--------------------------------------------------------");
        System.out.println(house2.printData());
        System.out.println("--------------------------------------------------------");
        System.out.println(house3.printData());
    }
}