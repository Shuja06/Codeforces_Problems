import java.util.Scanner;

class Q1535A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            boolean result = game(a, b, c, d);

            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean game(int a, int b, int c, int d) {
        int w1 = 0, w2 = 0;
        int l1 = 0, l2 = 0;

        if (a > b) {
            w1 = a;
            l1 = b;
        } else {
            w1 = b;
            l1 = a;
        }

        if (c > d) {
            w2 = c;
            l2 = d;
        } else {
            w2 = d;
            l2 = c;
        }

        if (w1 > l2 && w2 > l1) {
            return true;
        }
        return false;
    }
}
