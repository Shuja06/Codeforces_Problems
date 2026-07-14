// Is your horseshoe on the other hoof?

import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int[] arr = new int[4];
 
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
 
        int cnt = 0;
        for(int i=1; i<4; i++){
            if(arr[i] == arr[i-1]){
                cnt++;
            }
        }
 
        System.out.println(cnt);
    }
}
