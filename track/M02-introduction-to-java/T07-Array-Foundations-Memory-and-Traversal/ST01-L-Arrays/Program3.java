import java.util.Scanner;
public class Program3{
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int a[] = new int[5];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i <= a.length-1 ; i++) {
            a[i] = scan.nextInt();
        }
 
        System.out.println("Original Array Elments are: ");
        for (int i = 0; i <= a.length-1 ; i++) {
            System.out.println(a[i]);
        }

        int b[] = new int[a.length];
        int j = b.length-1;

        for (int i = 0; i <= a.length-1 ; i++) {
            b[j] = a[i];
            j--;
        }
        System.out.println("Reversed Array Elements are: ");
        for (int i = 0; i <= a.length-1 ; i++) {
            System.out.println(b[i]);
        }
        
        int rev[] = b;
        System.out.println("Reference Array Elements are: ");
        for(int i = 0; i <= rev.length-1; i++){
            System.out.println(rev[i]);
        }
    }
}