// Game with Integers

import java.util.Scanner;

public class Q1899A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int game = sc.nextInt();

        for(int i=0; i<game; i++){
            int n = sc.nextInt();

            if((n+1)%3 == 0 || (n-1)%3 == 0){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
