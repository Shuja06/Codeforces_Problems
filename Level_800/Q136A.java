// Present

import java.util.Scanner;
 
public class Q136A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int p;
 
        int[] a = new int[n+1];
 
        for(int i=1; i<=n; i++){
            p = sc.nextInt();
            a[p] = i;
        }
 
 
        for(int i=1; i<=n; i++){
            System.out.print(a[i]+ " ");
        }
 
    }
}
