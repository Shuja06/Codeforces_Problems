// Word Capitalization

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
 
        if(sb.charAt(0) != Character.toUpperCase(sb.charAt(0))){
            char ch = Character.toUpperCase(sb.charAt(0));
            sb.setCharAt(0, ch);
        }
        System.out.println(sb);
    }
}
