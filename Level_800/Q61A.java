// Ultra-Fast Mathematician

import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
 
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
 
        int i=0;
        while(i < s1.length()){
            if(s1.charAt(i) != s2.charAt(i)){
                sb.append("1");
            }else{
                sb.append("0");
            }
            i++;
        }
 
        System.out.println(sb);
    }
}
