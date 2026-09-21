import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroValues = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
            else if (arr[i] > 0) {
                positiveCount++;
            }
            else {
                zeroValues++;
            }
        }
        System.out.print(positiveCount + " " + negativeCount + " " + zeroValues);
        
        scanner.close();
    }
}
