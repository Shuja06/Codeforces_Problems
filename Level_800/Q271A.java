// Beautiful Year

import java.util.HashSet;
import java.util.Scanner;
 
public class Q271A {
    private static boolean isDistinct(int n){
        HashSet<Integer> set = new HashSet<>();
        
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            set.add(lastDigit);
        }
        if(set.size() == 4){
            return true;
        }
        return false;
 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        boolean result = false;
        while(!result){
            n += 1;
            result = isDistinct(n);
            if(result){
                System.out.println(n);
            }
        }
    }
}
