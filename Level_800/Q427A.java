// Police Recruits

import java.util.Scanner;

public class Q427A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int police = 0;
        int crimes = 0;

        for(int i=0; i<n; i++){
            int event = sc.nextInt();

            if(event > 0){
                police += event;
            }else{
                if(police > 0){
                    police--;
                }else{
                    crimes++;
                }
            }
        }

        System.out.println(crimes);
        sc.close();
    }
}
