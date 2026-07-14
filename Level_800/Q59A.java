// Word

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
        int lower = 0;
        int upper = 0;
 
        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))) {
                lower++;
            }else{
                upper++;
            }
        }
        if(lower >= upper){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }
    }
}
