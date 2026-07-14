// Elephant

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int X = 0;
        int cnt = 0;
        while(X < Y){
            X += 5;
            cnt++;
        }
        System.out.println(cnt);
    }
}
