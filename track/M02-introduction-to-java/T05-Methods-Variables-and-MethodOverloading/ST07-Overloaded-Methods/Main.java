import java.util.Scanner;

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();

        Printer p = new Printer();

        p.show(number);
        p.show(word);
    }
}