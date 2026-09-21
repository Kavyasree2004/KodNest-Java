import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter Target:");
        int target = scan.nextInt();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);

        scan.close();
    }
}