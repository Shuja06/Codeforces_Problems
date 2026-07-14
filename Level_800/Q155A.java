// I love %username%

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
 
        
        int score = sc.nextInt();
        int maxScore = score;
        int minScore = score;
        for(int i=1; i<n; i++){
            score = sc.nextInt();
            if(score < minScore){
                minScore = score;
                cnt++;
            }
            
            if(score > maxScore){
                maxScore = score;
                cnt++;
            }
        }
 
        System.out.println(cnt);
 
        sc.close();
   
