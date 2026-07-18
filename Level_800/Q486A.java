// Calculating Function

import java.util.Scanner;
 
public class Q486A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        long ans = 0;
 
        if(n % 2 == 0){
            ans = n / 2;
        }else{
            ans = -(n/2 + 1);
        }
 
 
        System.out.println(ans);
 
    }
}
