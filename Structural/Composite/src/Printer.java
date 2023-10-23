public class Printer {
    private Truck truck;
    public Printer(Truck t){
        this.truck=t;
    }

    public void printTotalPrice(){
        System.out.println("Total price in my truck : "+truck.getAllProducts().getPrice());
    }

    public void printTotalMass() {
        System.out.println("Total mass in my truck : "+truck.getAllProducts().getMass());
    }
}
