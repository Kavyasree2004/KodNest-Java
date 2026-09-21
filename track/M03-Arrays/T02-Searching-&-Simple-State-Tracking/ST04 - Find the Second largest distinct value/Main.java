import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int largest;
        int secondLargest;
        
        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        }
        else {
            largest = arr[1];
            secondLargest = arr[0];
        }
        
        for (int i = 2; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == largest) {
            System.out.print("No second largest distinct value");
        }
        else {
            System.out.print(secondLargest);
        }
    }
}
