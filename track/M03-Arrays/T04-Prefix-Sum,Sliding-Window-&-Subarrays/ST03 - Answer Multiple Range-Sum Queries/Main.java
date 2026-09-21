import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        long prefix[] = new long[n];
        
        prefix[0] = arr[0];
        
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            
            long sum = 0;
            
            if(left == 0){
                sum = prefix[right];
            }
            else {
                sum = prefix[right] - prefix[left - 1];
            }
            System.out.println(sum);
        }
    }
}
