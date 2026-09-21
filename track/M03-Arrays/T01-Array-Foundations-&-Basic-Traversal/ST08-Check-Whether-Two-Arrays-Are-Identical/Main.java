import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int result = 1;
        if (n != m) {
            result = 0;
        }
        else {
            for (int i = 0; i < n; i++) {
                if (arr[i] != arr2[i]) {
                    result = 0;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}
