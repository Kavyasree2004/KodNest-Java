import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        int closest = arr[0];
        long minDifference = Math.abs((long) arr[0] - target);
        
        for (int i = 1; i < n; i++) {
            long difference = Math.abs((long) arr[i] - target);
            if (difference < minDifference) {
                minDifference = difference;
                closest = arr[i];
            }
            else if (difference == minDifference && arr[i] < closest) {
                closest = arr[i];
            }
        }
        System.out.print(closest);
    }
}
