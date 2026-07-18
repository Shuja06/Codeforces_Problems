// Divisibility Problem

import java.util.Scanner;
 
public class Q1328A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            int moves = 0;
            if(a % b == 0){
                moves = 0;
            }else{
                moves = b - (a % b);
            }
 
            arr[i] = moves;
        }
 
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
