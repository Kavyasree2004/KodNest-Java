import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println(evenCount + " " + oddCount);
        
        scanner.close();
    }
}
