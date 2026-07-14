// Drinks

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int p;
 
        int sum = 0;
        for(int i=0; i<n; i++){
            p = sc.nextInt();
            sum += p;
        }
 
        float percent = sum / (float)n;
        System.out.println(percent);
 
    }
}
