import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int rows= scan.nextInt();
            int cols= scan.nextInt();

            int[][] matrix = new int[rows] [cols];
            for (int i = 0; i<rows; i++) {
                for (int j = 0; j<cols; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            for (int i=0; i<rows; i++) {
                int rowTotal = 0;
                
                for (int j = 0; j<cols; j++){
                    rowTotal += matrix[i][j];
                }
                System.out.println("Row" + (1+1)+"total: " + rowTotal);
            }
            scan.close();
        }
    }