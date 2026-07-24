// Minimize!

import java.util.Scanner;

public class Q2009A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int c = a;
            while(c <= b){
                min = Math.min(min, (c-a) + (b-c));
                c = c + 1;
            }
            System.out.println(min);
        }
        sc.close();
    }
}