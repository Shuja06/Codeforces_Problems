// Hulk

import java.util.Scanner;
 
public class Q705A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
 
        int n = sc.nextInt();
 
        int i=1;
        while(i <= n){
            if(i % 2 != 0){
                sb.append("I hate ");
                if(i != n){
                    sb.append("that ");
                }
            }else{
                sb.append("I love ");
                if(i != n){
                    sb.append("that ");
                }
            }
            i++;
        }
        sb.append("it");
 
        System.out.println(sb);
        sc.close();
    }
}
