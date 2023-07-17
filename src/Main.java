import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        System.out.println("Thank you. We have set the price of our standard cupcake to " + price);

        System.out.println("Now, what should we set the price of our red velvet cupcake to?");
        String redVelvetPriceText = input.nextLine();

        double rvPrice = Double.parseDouble(redVelvetPriceText);
        redVelvet.setPrice(price);
        System.out.println("Our red velvet cupcake now costs" + rvPrice);

        System.out.println("And lastly, our chocolate cupcake. What price should it be?");
        String chocolatePriceText = input.nextLine();

        double chocPrice = Double.parseDouble(chocolatePriceText);
        chocolate.setPrice(chocPrice);

        System.out.println("Thank you, our chocolate cupcake now costs " + chocPrice);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

    }


}