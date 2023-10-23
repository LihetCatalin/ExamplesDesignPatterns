package Logistics;

import Transport.TransportVehicle;
import Transport.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public TransportVehicle createTransport() {
        return new Truck();
    }
}
