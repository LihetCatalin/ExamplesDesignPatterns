package HouseRelated;
public class AirConditioner {
    private String model;
    private boolean started = false;
    public AirConditioner(String model){
        this.model=model;
    }

    public void on(){
        this.started=true;
    }

    public void off(){
        this.started=false;
    }

    public boolean isOn(){
        return this.started;
    }
}
