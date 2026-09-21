import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    // Default constructor
    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    // Parameterized constructor (Constructor Overloading)
    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        // Create the default plan object
        MobilePlan m1 = new MobilePlan();

        // Create the selected plan object
        MobilePlan m2 = new MobilePlan(planName, price);

        // Display both plans
        m1.display();
        m2.display();
    }
}
