import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int row= scan.nextInt();
            int col= scan.nextInt();

            int[][] matrix = new int[row][col];
            for (int i=0; i<row; i++) {
                for (int j = 0; j<col; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }
            
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    System.out.print(matrix[i][j]);
                    
                    if (j < col-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            scan.close();
        }
    }
    