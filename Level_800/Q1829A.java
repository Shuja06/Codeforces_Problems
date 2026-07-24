// Love Story

import java.util.Scanner;

public class Q1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actual = "codeforces";

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.nextLine();
            int differ = 0;

            int i=0;
            while(i < 10){
                if(actual.charAt(i) != str.charAt(i)) differ++;
                i++;
            }
            System.out.println(differ);
        }
        sc.close();
    }
}
