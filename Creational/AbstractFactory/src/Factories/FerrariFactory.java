package Factories;

import CarComponents.Bodies.Body;
import CarComponents.Bodies.FerrariBody;
import CarComponents.Engines.Engine;
import CarComponents.Engines.FerrariEngine;
import CarComponents.SteerginWheels.FerrariSteeringWheel;
import CarComponents.SteerginWheels.SteeringWheel;

public class FerrariFactory implements F1CarFactory {
    @Override
    public Engine createEngine() {
        return new FerrariEngine();
    }
    @Override
    public SteeringWheel createSteeringWheel() {
        return new FerrariSteeringWheel();
    }
    @Override
    public Body createBody() {
        return new FerrariBody();
    }
}
