import java.util.Scanner;

public class Q707A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'C' || arr[i][j] == 'M' || arr[i][j] == 'Y') {
                    System.out.println("#Color");
                    return;
                }
            }
        }

        System.out.println("#Black&White");

        sc.close();
    }
}
