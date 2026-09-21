import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = scan.nextInt();
        int a[] = new int[size];

        System.out.println("Enter Array Elements :");

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("Array Elements are :");

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }

        System.out.println("Total: " + sum);
    }
}