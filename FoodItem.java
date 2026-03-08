public class FoodItem {
   private int id;
   private String name;
   private double price;

   public FoodItem(int var1, String var2, double var3) {
      this.id = var1;
      this.name = var2;
      this.price = var3;
   }

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public double getPrice() {
      return this.price;
   }
}
