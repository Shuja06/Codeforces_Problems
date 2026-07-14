// Queue at the School

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int t = sc.nextInt();
 
        sc.nextLine();
        StringBuilder sb = new StringBuilder(sc.nextLine());
 
        if(sb.length() > n){
            System.out.println("Length exceeded : " + n);
            return;
        }
 
        while(t > 0){
            for(int i=0; i<sb.length()-1; i++){
                if(sb.charAt(i) == 'B' && sb.charAt(i+1) == 'G'){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i+1));
                    sb.setCharAt(i+1, temp);
                    i++;
                }
            }
            t--;
        }
 
 
        System.out.println(sb);
    }
}
