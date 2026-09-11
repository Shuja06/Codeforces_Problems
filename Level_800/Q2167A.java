// Square?

import java.util.Scanner;

class Q2167A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            boolean possible = square(a, b, c, d);

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean square(int a, int b, int c, int d) {
        return a == b && b == c && c == d && d == a;
    }
}
