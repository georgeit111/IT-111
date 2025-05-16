import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String specials;
        String coffee;
        double price;

        System.out.println("Please enter a day of the week excluding weekend (Monday - Friday only!):");

        specials = input.next();

        // Loop until a valid weekday is entered
        while (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {
            System.out.println("Please enter a valid weekday (Monday to Friday):");
            specials = input.next();
        }

        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
            }
            default -> {
                System.out.println("Invalid day entered. Exiting.");
                input.close();
                return;
            }
        }

        // Print the coffee special
        System.out.printf("%s's coffee of the day is a %s and the price will be $%.2f%n", specials, coffee, price);

        // Ask for quantity
        System.out.println("How many " + coffee + " would you like to order?");
        int quantity = input.nextInt();

        // Order summary
        if (quantity <= 0) {
            System.out.println("Looks like you don't like " + coffee + "! So sad.");
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only one " + coffee + " today!");
        } else {
            double total = price * quantity;
            System.out.printf("Your total for %d %s(s) is: $%.2f%n", quantity, coffee, total);
        }

        input.close();
    }
}
