// Minimal Squares

import java.util.Scanner;

public class Q1360A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                a = a + a;
            } else {
                b = b + b;
            }

            if (a < b) {
                System.out.println(b * b);
            } else {
                System.out.println(a * a);
            }
        }

        sc.close();
    }
}
