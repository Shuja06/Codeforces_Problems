// Bit++


import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        
 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }
 
        int X = 0;
        for(int i=0; i<n; i++){
            if(arr[i].equals("++X") || arr[i].equals("X++")){
                X++;
            }
            else if(arr[i].equals("--X") || arr[i].equals("X--")) {
                X--;
            }
        }
 
        System.out.println(X);
    }
}
