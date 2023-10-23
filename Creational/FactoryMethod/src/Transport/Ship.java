package Transport;
public class Ship implements TransportVehicle{
    public void loadGoods(){
        System.out.println("Loaded 1000 boxes on the ship");
    }

    public void deliver(){
        System.out.println("Ship: delivering the products!");
    }
}
