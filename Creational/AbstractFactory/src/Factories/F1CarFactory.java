package Factories;

import CarComponents.Bodies.Body;
import CarComponents.Engines.Engine;
import CarComponents.SteerginWheels.SteeringWheel;

public interface F1CarFactory {
    public Engine createEngine();
    public SteeringWheel createSteeringWheel();
    public Body createBody();
}
