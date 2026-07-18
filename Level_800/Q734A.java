// Anton & Danrik

import java.util.Scanner;
 
public class Q734A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
 
        int Anton = 0;
        int Danik = 0;
 
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                Anton++;
            }else{
                Danik++;
            }
        }
 
        if(Anton > Danik){
            System.out.println("Anton");
        }else if(Danik > Anton){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
