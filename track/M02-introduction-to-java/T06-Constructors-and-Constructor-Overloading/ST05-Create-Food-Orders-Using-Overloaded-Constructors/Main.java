import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    // First constructor: sets default quantity to 1
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    // Second constructor: sets both custom values
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Provided method to display the order details
    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the inputs without any text prompts
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // 1. One order using only the item
        FoodOrder order = new FoodOrder(item);

        // 2. One order using both item and quantity
        FoodOrder order1 = new FoodOrder(item, quantity);

        // Call the display method for both orders
        order.display();
        order1.display();
    }
}
