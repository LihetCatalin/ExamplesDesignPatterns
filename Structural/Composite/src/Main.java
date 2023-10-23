
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Truck t1 = new Truck();

        t1.loadTruck(
                new Bread(),
                new CompoundProduct(
                        new Bread(),
                        new Chocolate()
                ),
                new CompoundProduct(
                        new CompoundProduct(
                                new Salt(),
                                new Bread()
                        ),
                        new Milk(),
                        new Milk(),
                        new Chocolate(),
                        new Salt()
                )
        );

        Printer report = new Printer(t1);
        report.printTotalPrice();
        report.printTotalMass();
    }
}