import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left = sc.nextInt();
        int right = sc.nextInt();
        
        if(left < 0 || right >= n || left > right){
            System.out.print("-1");
            return;
        }
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
