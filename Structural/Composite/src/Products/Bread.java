package Products;
public class Bread implements Product {
    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public int getMass() {
        return 450;
    }
}
