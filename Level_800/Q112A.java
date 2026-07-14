// Petya and Strings


import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
 
        
        for(int i=0; i<s1.length(); i++){
            if(Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s2.charAt(i))){
                if(Character.toLowerCase(s1.charAt(i)) > Character.toLowerCase(s2.charAt(i))){
                    System.out.println("1");
                    return;
                }else {
                    System.out.println("-1"); 
                    return;
                }
            }
            if(i == s1.length()-1){
                System.out.println("0");
                return;
            }
        }
 
    }
}
