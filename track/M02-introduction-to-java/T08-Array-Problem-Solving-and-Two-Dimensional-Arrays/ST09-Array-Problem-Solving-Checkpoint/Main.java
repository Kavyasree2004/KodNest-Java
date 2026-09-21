import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        int arrayTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            arrayTotal += arr[i];
        }
        
        int matrixTotal = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixTotal += matrix[i][j];
            }
        }
        
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);
    }
}
