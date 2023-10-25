import Strategies.PublicTransportStrategy;
import Strategies.RoadStrategy;
import Strategies.WalkStrategy;
import Navigator.Navigator;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Navigator navigator = new Navigator();

        System.out.println("Me: Guess I will take my car! :)");
        navigator.setStrategy(new RoadStrategy());
        navigator.buildRoute();

        System.out.println("Me: Guess I will go by foot! :)");
        navigator.setStrategy(new WalkStrategy());
        navigator.buildRoute();

        System.out.println("Me: Guess I will go by bus! :)");
        navigator.setStrategy(new PublicTransportStrategy());
        navigator.buildRoute();
    }
}