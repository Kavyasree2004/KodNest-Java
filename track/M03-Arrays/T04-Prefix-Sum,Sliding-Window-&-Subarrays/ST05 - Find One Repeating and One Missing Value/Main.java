import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int repeating = 0;
        int missing = 0;
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                repeating = i;
            }
            else if (count == 0){
                missing = i;
            }
        }
        System.out.println(repeating + " " + missing);
        
    }
}
