// A+B?

import java.util.Scanner;

class Q1772A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String nums = sc.next();
            int a = (int) nums.charAt(0) - '0';
            int b = (int) nums.charAt(2) - '0';

            System.out.println(a + b);
        }

        sc.close();
    }
}
