import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();

        if(s.length() > n){
            System.out.println("String is too large");
            return;
        }else{
            for(int i=0; i<s.length(); i++){
                set.add(s.charAt(i));
            }
        }

        // if(set.size() == 26){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("NO");
        // }
    }
}
