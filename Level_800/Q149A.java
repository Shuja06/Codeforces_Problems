import java.util.HashSet;
import java.util.Scanner;

public class Q149A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        int p = sc.nextInt();
        for(int i=0; i<p; i++){
            int x_level = sc.nextInt();
            set.add(x_level);
        }

        int q = sc.nextInt();
        for(int j=0; j<q; j++){
            int y_level = sc.nextInt();
            set.add(y_level);
        }

        if(set.size() == n){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }

        sc.close();
    }
}
