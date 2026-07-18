// Stones on the table

import java.util.Scanner;
 
public class Q266A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
 
        int cnt = 0;
 
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)) cnt++;
        }
 
        System.out.println(cnt);
    }
}
