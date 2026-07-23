// Array Coloring

import java.util.Scanner;

public class Q1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            while(n-- > 0){
                int num = sc.nextInt();
                sum += num;
            }
            if(sum % 2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }
        
    }
}
