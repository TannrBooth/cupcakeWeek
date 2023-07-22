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

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("Now let's price some drinks.");
        System.out.println("What should our bottled water cost?");

        String priceWaterText = input.nextLine();

        double priceWater = Double.parseDouble(priceWaterText);
        water.setPrice(priceWater);
        System.out.println("Thank you. We have set the price of our bottled water to " + priceWater);

        System.out.println("Next we need to price our soda. What should it cost?");

        String priceSodaText = input.nextLine();

        double priceSoda = Double.parseDouble(priceSodaText);
        soda.setPrice(priceSoda);
        System.out.println("Our bottles of soda will now be " + priceSoda);

        System.out.println("And last of all, milk. What do you think the price should be?");
        String priceMilkText = input.nextLine();

        double priceMilk = Double.parseDouble(priceMilkText);
        milk.setPrice(priceMilk);
        System.out.println("Excellent, the price of bottled milk is now " + priceMilk);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu,drinkMenu);
    }


}