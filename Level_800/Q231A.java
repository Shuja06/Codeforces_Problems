// Team

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
 
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
 
        int solvable = 0;
 
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<3; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt >= 2){
                solvable++;
            }
        }
 
        System.out.println(solvable);
    }
}
