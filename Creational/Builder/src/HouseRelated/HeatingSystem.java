package HouseRelated;
public class HeatingSystem {
    private boolean started = false;
    public HeatingSystem(){

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
