// A way too long ways

import java.util.Scanner;
 
public class Q71A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }
 
        for(int i=0; i<n; i++){
            String str = arr[i];
 
            if(str.length() <= 10) {
                System.out.println(str);
            }else{
                int len = str.substring(1, str.length()-1).length();
                System.out.println("" + str.charAt(0) + len + str.charAt(str.length()-1));
            }
        }
    }
}
