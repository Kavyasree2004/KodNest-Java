import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        if(n<2){
            System.out.print("No second s,allest distinct value");
            return;
        }
        
        int smallest;
        int secondSmallest;
        
        if(arr[0] < arr[1]){
            smallest = arr[0];
            secondSmallest = arr[1];
        }
        else{
            smallest = arr[1];
            secondSmallest = arr[0];
        }
        
        for(int i=2; i<n; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        
        if(smallest == secondSmallest){
            System.out.print("No second smallest distinct value");
        }
        else{
            System.out.print(secondSmallest);
        }
    }
}
