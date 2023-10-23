package Products;
public class Chocolate implements Product {
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public int getMass() {
        return 100;
    }
}
