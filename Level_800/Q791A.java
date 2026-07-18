// Bear and Big Brother

import java.util.Scanner;
 
public class Q791A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Limark = sc.nextInt();
        int Bob = sc.nextInt();
 
        int cnt = 0;
        while(Limark <= Bob){
            Limark *= 3;
            Bob *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
