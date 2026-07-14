// Translation

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        StringBuilder s = new StringBuilder(sc.nextLine());
        String t = sc.nextLine();
        // StringBuilder t = new StringBuilder(sc.nextLine());
 
        s.reverse();
        String reversed = s.toString();
        if(reversed.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
