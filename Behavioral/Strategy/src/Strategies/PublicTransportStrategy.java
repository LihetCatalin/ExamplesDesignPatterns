package Strategies;
public class PublicTransportStrategy implements Strategy {
    @Override
    public void buildRoute() {
        System.out.println("Building public transport route...");
    }
}
