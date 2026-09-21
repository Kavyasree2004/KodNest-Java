import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int total = 0;
        double average = 0.00;
        
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);
        
        average = (double) total / size;
        System.out.printf("%.2f", average);
        
        scanner.close();
    }
}
