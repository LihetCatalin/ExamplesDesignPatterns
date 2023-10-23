package Logistics;

import Transport.Ship;
import Transport.TransportVehicle;

public class SeaLogistics extends Logistics {
    @Override
    public TransportVehicle createTransport() {
        return new Ship();
    }
}
