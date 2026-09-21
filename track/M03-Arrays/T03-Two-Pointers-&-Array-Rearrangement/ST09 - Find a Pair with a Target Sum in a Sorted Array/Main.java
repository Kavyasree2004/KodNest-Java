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
        
        int left = 0;
        int right = n-1;
        boolean found = false;
        
        while(left < right){
            int currentSum = arr[left] + arr[right];
            
            if(currentSum == target){
                System.out.print(arr[left] + " " + arr[right]);
                found = true;
                break;
            } else if(currentSum < target){
                left++;
            } else {
                right--;
            }
        }
        if(!found){
            System.out.print("-1");
        }
    }
}
