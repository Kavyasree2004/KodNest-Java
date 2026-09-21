import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.next();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one object
        MethodDemo m = new MethodDemo();

        // Call all four methods
        m.sayHello();
        m.greet(name);
        System.out.println("Lucky Number: " + m.getLuckyNumber());
        System.out.println("Sum: " + m.add(first, second));
    }
}