import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order (ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like an order? (Y or N)");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if(placeOrder.equalsIgnoreCase("y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            System.out.println("Here is the menu.");
            System.out.println("CUPCAKES");

            int itemNumber = 0;

            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;
                System.out.println(itemNumber);
                cupcakeMenu.get(i).type();
                System.out.println("Price: " + cupcakeMenu.get(i).getPrice());
            }

            System.out.println("DRINKS");

            for (int i = 0; i < drinkMenu.size(); i++) {
                itemNumber++;
                System.out.println(itemNumber);
                drinkMenu.get(i).type();
                System.out.println("Price: " + drinkMenu.get(i).getPrice());

            }

            boolean ordering = true;

            while (ordering) {
                System.out.println("What would you like to order? Please use the number associated with each item to order.");
                int orderChoice = input.nextInt();
                input.nextLine();

                if (orderChoice == 1) {
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order");
                } else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order");
                } else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order");
                } else if (orderChoice == 4) {
                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order");
                } else if (orderChoice == 5) {
                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order");
                } else if (orderChoice == 6) {
                    order.add(drinkMenu.get(2));
                    System.out.println("Item added to order");
                } else {
                    System.out.println("Sorry, we don't seem to have that on the menu.");
                }

                System.out.println("Would you like to continue ordering? Y/N");
                String continueOrder = input.nextLine();

                if (!continueOrder.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
                System.out.println(ordering);
            }

            System.out.println(order.get(0));
            System.out.println(order.get(1));

            double subtotal = 0.0;

            for (int i = 2; i < order.size(); i++) {
                if (order.get(i) == cupcakeMenu.get(0)) {
                    cupcakeMenu.get(0).type();
                    System.out.println(cupcakeMenu.get(0).getPrice());
                    subtotal = subtotal + cupcakeMenu.get(0).getPrice();
                } else if (order.get(i) == cupcakeMenu.get(1)) {
                    cupcakeMenu.get(1).type();
                    System.out.println(cupcakeMenu.get(1).getPrice());
                    subtotal = subtotal + cupcakeMenu.get(1).getPrice();
                } else if (order.get(i) == cupcakeMenu.get(2)) {
                    cupcakeMenu.get(2).type();
                    System.out.println(cupcakeMenu.get(2).getPrice());
                    subtotal = subtotal + cupcakeMenu.get(2).getPrice();
                } else if (order.get(i) == drinkMenu.get(0)) {
                    drinkMenu.get(0).type();
                    System.out.println(drinkMenu.get(0).getPrice());
                    subtotal = subtotal + drinkMenu.get(0).getPrice();
                } else if (order.get(i) == drinkMenu.get(1)) {
                    drinkMenu.get(1).type();
                    System.out.println(drinkMenu.get(1).getPrice());
                    subtotal = subtotal + drinkMenu.get(1).getPrice();
                } else if (order.get(i) == drinkMenu.get(2)) {
                    drinkMenu.get(2).type();
                    System.out.println(drinkMenu.get(2).getPrice());
                    subtotal = subtotal + drinkMenu.get(2).getPrice();
                } else {
                    System.out.println("Sorry, that is not an item on our menu.");
                }

                System.out.println("$" + subtotal);

                new CreateFile();
                new WriteToFile(order);
            }

        } else
        {
            System.out.println("Have a nice day then.");
        }
    }

}
