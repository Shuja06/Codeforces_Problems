// Black Sqare

import java.util.HashMap;
import java.util.Scanner;

public class Q431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int k=0;
        while(k++ < 4){
            int n = sc.nextInt();
            map.put(k, n);
        }

        sc.nextLine();
        String str = sc.nextLine();

        int cal = 0;
        for(int i=0; i<str.length(); i++){
            int ch = (int) str.charAt(i) - '0';
            cal += map.get(ch);
        }

        System.out.println(cal);
        sc.close();
    }    
}
