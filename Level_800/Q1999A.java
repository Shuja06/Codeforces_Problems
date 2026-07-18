//A+B Again?
import java.util.Scanner;

public class Q1999A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            System.out.println(num%10 + num/10);
        }
        sc.close();
    }
}