// New Year and Hurry

import java.util.Scanner;
 
public class Q750A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int time = 0;
        int i=1;
        int cnt = 0;
        int total = 0;
        while(i <= n){
            time += 5 * i;
            total = time + k;
            i++;
            if(total > 240){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
 
        sc.close();
    }
}
