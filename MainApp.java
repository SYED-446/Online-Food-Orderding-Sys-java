import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodService service = new FoodServiceImpl();

        while(true) {

            try {

                System.out.println("\n1 Show Menu");
                System.out.println("2 Add Food");
                System.out.println("3 Remove Food");
                System.out.println("4 Calculate Bill");
                System.out.println("5 Generate Order");
                System.out.println("6 Exit");

                int choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        service.showMenu();
                        break;

                    case 2:
                        System.out.println("Enter Food ID");
                        service.addFood(sc.nextInt());
                        break;

                    case 3:
                        System.out.println("Enter Food ID");
                        service.removeFood(sc.nextInt());
                        break;

                    case 4:
                        service.calculateBill();
                        break;

                    case 5:
                        service.generateOrder();
                        break;

                    case 6:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }

            } catch(Exception e) {

                System.out.println("Invalid Input");
                sc.next();
            }
        }
    }
}
