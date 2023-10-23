package Logistics;

import Transport.TransportVehicle;

public abstract class Logistics {

    public void planDelivery() {
        System.out.println("Planning to do a delivery today...");
    }

    public abstract TransportVehicle createTransport();
}
