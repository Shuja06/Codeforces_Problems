// Marathon
import java.util.Scanner;

// Marathon
public class Q1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int cnt = 0;

            if(b > a) cnt++;
            if(c > a) cnt++;
            if(d > a) cnt++;

            System.out.println(cnt);
        }
        sc.close();
    }
}
