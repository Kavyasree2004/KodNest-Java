import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        int sum = 0;
        int left = 0;
        
        for(int right = 0; right < n; right++){
            sum += arr[right];
            while(sum > target && left <= right){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                System.out.println(left + " " + right);
                return;
            }
        }
        System.out.println("-1");
    }
}
