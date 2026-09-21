import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner to read user input
        Scanner scan = new Scanner(System.in);
        
        // 1. Create an integer array of size 5
        int arr[] = new int[5];
        
        // 2. Use Scanner and a loop to read the five values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        
        // 3. Use another loop to add every array value to total
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        // 4. Print the final total
        System.out.println("Total: " + total);
        
        // Close the scanner resource
        scan.close();
    }
}
