package Transport;
public class Plane implements TransportVehicle{
    public void loadGoods(){
        System.out.println("Loaded 500 boxes into the plane");
    }

    public void deliver(){
        System.out.println("Plane: delivering the products!");
    }
}
