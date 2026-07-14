// Next Round

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
 
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
 
        int score = a[k-1];
 
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(a[i] > 0 &&a[i] >= score){
                cnt++;
            }
        }
 
        System.out.println(cnt);
    }
}
