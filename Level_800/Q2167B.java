import java.util.Scanner;

public class Q2167B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        while (c-- > 0) {
            int n = sc.nextInt();

            String s = sc.next();
            String t = sc.next();

            boolean isPossible = name(n, s, t);

            if (isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean name(int n, String s, String t) {
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            int s_index = s.charAt(i) - 'a';
            freq[s_index]++;

            int t_index = t.charAt(i) - 'a';
            freq[t_index]--;

        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
