import java.util.Scanner;

public class Q581A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int dif_pairs = 0;
        while(a > 0 && b > 0){
            a--;
            b--;
            dif_pairs++;
        }

        int same_pairs = Math.max(a, b) / 2;
        
        System.out.println(dif_pairs + " " + same_pairs);
        sc.close();
    }
}
