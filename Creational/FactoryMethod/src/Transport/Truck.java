package Transport;

public class Truck implements TransportVehicle {
    public void loadGoods(){
        System.out.println("Loaded 100 boxes into the truck");
    }

    public void deliver(){
        System.out.println("Truck: delivering the products!");
    }
}
