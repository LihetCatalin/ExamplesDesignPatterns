import Logistics.AirLogistics;
import Logistics.RoadLogistics;
import Logistics.SeaLogistics;
import Logistics.Logistics;
import Transport.TransportVehicle;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Logistics logistics;
        logistics = new RoadLogistics();
        logistics.planDelivery();
        TransportVehicle t1 = logistics.createTransport();
        t1.loadGoods();
        t1.deliver();

        System.out.println("------------------------------------------------");
        logistics = new SeaLogistics();
        logistics.planDelivery();
        TransportVehicle t2 = logistics.createTransport();
        t2.loadGoods();
        t2.deliver();

        System.out.println("------------------------------------------------");
        logistics = new AirLogistics();
        logistics.planDelivery();
        TransportVehicle t3 = logistics.createTransport();
        t3.loadGoods();
        t3.deliver();
    }
}