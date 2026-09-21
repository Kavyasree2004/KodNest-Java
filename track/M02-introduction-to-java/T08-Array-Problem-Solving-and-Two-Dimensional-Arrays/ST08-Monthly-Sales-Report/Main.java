import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int products = scan.nextInt();
        int months = scan.nextInt();
        
        int matrix[][] = new int[products][months];
        for (int i = 0; i < products; i++) {
            for (int j = 0; j < months; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < products; i++) {
            int productsTotal = 0;
            for (int j = 0; j < months; j++) {
                productsTotal += matrix[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + productsTotal);
        }
    }
}
