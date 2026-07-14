// Alternating Strings

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
 
            int bad = 0;
 
            for(int j=0; j<str.length()-1; j++){
                if(str.charAt(j) == str.charAt(j+1)){
                    bad++;
                }
            }
 
            if(bad <= 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}
