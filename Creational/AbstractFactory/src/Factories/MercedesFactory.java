package Factories;

import CarComponents.Bodies.Body;
import CarComponents.Bodies.MercedesBody;
import CarComponents.Engines.Engine;
import CarComponents.Engines.MercedesEngine;
import CarComponents.SteerginWheels.MercedesSteeringWheel;
import CarComponents.SteerginWheels.SteeringWheel;

public class MercedesFactory implements F1CarFactory {
    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public SteeringWheel createSteeringWheel() {
        return new MercedesSteeringWheel();
    }

    @Override
    public Body createBody() {
        return new MercedesBody();
    }
}
