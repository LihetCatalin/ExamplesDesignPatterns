package TruckModel;
import Products.CompoundProduct;
import Products.Product;

public class Truck {
    private CompoundProduct allProducts = new CompoundProduct();

    public void loadTruck(Product... products) {
        System.out.println("I am loading my truck!");
        allProducts.clear();
        allProducts.add(products);
    }

    public CompoundProduct getAllProducts(){
        return  this.allProducts;
    }
}
