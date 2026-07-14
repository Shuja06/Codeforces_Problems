// Sreeja and Dima

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
 
        int l = 0;
        int r = a.length-1;
 
        int S=0;
        int D=0;
 
        boolean sreejaTurn = true;
 
        while(l <= r){
            int picked;
 
            if(a[l] > a[r]){
                picked = a[l];
                l++;
            }else {
                picked = a[r];
                r--;
            }
            
            if(sreejaTurn){
                S += picked;
            }else{
                D += picked;
            }
 
            sreejaTurn = !sreejaTurn;
        }
 
        System.out.println(S + " " + D);
 
        sc.close();
    }
}
