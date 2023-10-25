package Navigator;
import Strategies.Strategy;

public class Navigator {
    private Strategy strategy;

    public void buildRoute(){
        strategy.buildRoute();
    }
    public void setStrategy(Strategy s){
        this.strategy=s;
    }
}
