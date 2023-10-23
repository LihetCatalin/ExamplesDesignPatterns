package Products;
public class Milk implements Product {
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public int getMass() {
        return 1000;
    }
}
