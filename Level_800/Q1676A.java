// Lucky?

import java.util.Scanner;

public class Q1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int s1 = 0, s2 = 0;
            for (int j = 0; j < 3; j++) {
                s1 += str.charAt(j) - '0';
            }
            for (int k = 3; k < 6; k++) {
                s2 += str.charAt(k) - '0';
            }

            if (s1 == s2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
