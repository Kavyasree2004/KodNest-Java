import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        
        long sum = ((long) n * (n + 1)) / 2;
        long total = 0;
        
        for(int i=0; i<n-1; i++){
            total += arr[i];
        }
        long missingNumber = sum - total;
        System.out.print(missingNumber);
    }
}
