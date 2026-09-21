import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int minimum = arr[0];
        int maximum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];
            }

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}