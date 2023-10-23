package CarModel;

import CarComponents.Bodies.Body;
import CarComponents.Engines.Engine;
import CarComponents.SteerginWheels.SteeringWheel;
import Factories.F1CarFactory;

public class Car {
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Body body;
    public Car(F1CarFactory factory){
        this.engine=factory.createEngine();
        this.steeringWheel=factory.createSteeringWheel();
        this.body=factory.createBody();
    }

    public void testCar() {
        body.showColor();
        engine.start();
        steeringWheel.rotate();
    }
}
