import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][5];
        
        System.out.println("Enter Array Elements:"); 
        for(int i = 0; i<=a.length-1; i++){
            for(int j = 0; j<=a[i].length-1; j++){
                a[i][j] = scan.nextInt();
            }
        }
    
        System.out.println("Array Elements are:");
        for(int i = 0; i<=a.length-1; i++) {
            for(int j = 0; j<=a[i].length-1; j++) {
                System.out.print(a[i][j] + " ");
            }
        System.out.println();
        }
    }
}
