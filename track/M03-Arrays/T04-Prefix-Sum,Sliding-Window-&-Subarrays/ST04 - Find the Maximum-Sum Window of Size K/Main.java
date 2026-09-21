import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        long sum = 0;
        
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        
        long maxSum = sum;
        for(int i = k; i < n; i++){
            sum += arr[i] - arr[i - k];
            
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.print(maxSum);
    }
}
