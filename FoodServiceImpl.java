
    import java.util.*;

public class FoodServiceImpl implements FoodService {

    List<FoodItem> menu = new ArrayList<>();
    Order order = new Order();

    public FoodServiceImpl() {

        menu.add(new FoodItem(1,"Pizza",250));
        menu.add(new FoodItem(2,"Burger",120));
        menu.add(new FoodItem(3,"Pasta",180));
        menu.add(new FoodItem(4,"Sandwich",100));
    }

    public void showMenu() {

        System.out.println("------ FOOD MENU ------");

        for(FoodItem item : menu) {
            System.out.println(item.getId()+" "+item.getName()+" Rs."+item.getPrice());
        }
    }

    public void addFood(int id) {

        for(FoodItem item : menu) {

            if(item.getId()==id) {
                order.addItem(item);
                System.out.println(item.getName()+" added to cart");
                return;
            }
        }

        System.out.println("Item not found");
    }

    public void removeFood(int id) {
        order.removeItem(id);
    }

    public void calculateBill() {

        double total = 0;

        for(FoodItem item : order.getCart()) {

            System.out.println(item.getName()+" Rs."+item.getPrice());
            total += item.getPrice();
        }

        System.out.println("Total Bill: "+total);
    }

    public void generateOrder() {

        double total = 0;

        System.out.println("----- ORDER SUMMARY -----");

        for(FoodItem item : order.getCart()) {

            System.out.println(item.getName()+" Rs."+item.getPrice());
            total += item.getPrice();
        }

        System.out.println("Total: "+total);
        System.out.println("Order Placed Successfully");
    }
}

