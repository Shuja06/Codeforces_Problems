// Domino piling

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int m = sc.nextInt();
        int n = sc.nextInt();
 
        int prod = m*n;
        int result = prod/2;
        System.out.println(result);
    }
}
