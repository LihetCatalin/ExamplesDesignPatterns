import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundProduct implements Product {
    private List<Product> children = new ArrayList<>();
    public CompoundProduct(Product ... products) {
        this.add(products);
    }

    public void add(Product p){
        children.add(p);
    }

    public void add(Product ... ps){
        children.addAll(Arrays.asList(ps));
    }

    public void remove(Product p){
        children.remove(p);
    }

    public void remove(Product ... ps){
        children.removeAll(Arrays.asList(ps));
    }

    public void clear(){
        children.clear();
    }
    @Override
    public int getPrice() {
        int total = 0;
        for (Product p : children){
            total += p.getPrice();
        }
        return total;
    }

    @Override
    public int getMass() {
        int total = 0;
        for (Product p : children){
            total += p.getMass();
        }
        return total;
    }
}
