import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {
     private List<FoodItem> cart = new ArrayList<>();

    public void addItem(FoodItem item) {
        cart.add(item);
    }

    public void removeItem(int id) {

        Iterator<FoodItem> itr = cart.iterator();

        while (itr.hasNext()) {
            FoodItem item = itr.next();

            if (item.getId() == id) {
                itr.remove();
                System.out.println(item.getName() + " removed");
                return;
            }
        }

        System.out.println("Item not found in cart");
    }

    public List<FoodItem> getCart() {
        return cart;
    }
}
