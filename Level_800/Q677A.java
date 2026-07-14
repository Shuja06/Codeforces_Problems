// Vanya and Fence

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int h = sc.nextInt();
 
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
 
        int width = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= h){
                width += 1;
            }else{
                width += 2;
            }
        }
 
        System.out.println(width);
    }
}
