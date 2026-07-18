//Beautiful Matrix

import java.util.Scanner;
 
public class Q263A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int[][] matrix = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
 
        int iIndex = 0;
        int jIndex = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(matrix[i][j] == 1){
                    iIndex = i;
                    jIndex = j;
                }
            }
        }
 
        int I = 2;
        int J = 2;
 
        int s1 = Math.abs(I-iIndex);
        int s2 = Math.abs(J-jIndex);
        int sum = s1 + s2;
        System.out.println(sum);
    }
}
