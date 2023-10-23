package Factories;

import CarComponents.Bodies.Body;
import CarComponents.Bodies.RedBullBody;
import CarComponents.Engines.Engine;
import CarComponents.Engines.RedBullEngine;
import CarComponents.SteerginWheels.RedBullSteeringWheel;
import CarComponents.SteerginWheels.SteeringWheel;

public class RedBullFactory implements F1CarFactory {
    @Override
    public Engine createEngine() {
        return new RedBullEngine();
    }

    @Override
    public SteeringWheel createSteeringWheel() {
        return new RedBullSteeringWheel();
    }

    @Override
    public Body createBody() {
        return new RedBullBody();
    }
}
