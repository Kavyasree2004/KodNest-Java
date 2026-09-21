import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        for(int i = 0; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        
        while (left < right ){
            if(a[left] %2 ==0){
                left ++;
            }
            else if(a[right] % 2 !=0){
                right --;
            }
            else{
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
