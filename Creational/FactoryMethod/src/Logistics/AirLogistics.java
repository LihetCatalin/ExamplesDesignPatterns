package Logistics;

import Transport.Plane;
import Transport.TransportVehicle;

public class AirLogistics extends Logistics {
    @Override
    public TransportVehicle createTransport() {
        return new Plane();
    }
}
