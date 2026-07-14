// Soldiers and Bananas

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
 
        int cur_price = w;
        int sum = 0;
        for(int i=1; i<=w; i++){
            cur_price = i * k;
            sum += cur_price;
        }
 
        if(sum - n > 0){
            System.out.println(sum-n);
        }
        else{
            System.out.println("0");
        }
    }
}
