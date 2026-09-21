import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator res = new ResultCalculator();

        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + res.getTotal(first, second));
        System.out.println("Three-Mark Total: " + res.getTotal(first, second, third));
    }
}