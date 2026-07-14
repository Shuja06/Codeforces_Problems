// The New Year: Meeting Friends

import java.util.Scanner;

public class Q723A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum_a = Math.abs(a-b) + Math.abs(a-c);
        int sum_b = Math.abs(b-a) + Math.abs(b-c);
        int sum_c = Math.abs(c-a) + Math.abs(c-b);

        System.out.println(Math.min(sum_a, Math.min(sum_b, sum_c)));

        sc.close();
    }
}
