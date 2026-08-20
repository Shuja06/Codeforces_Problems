// ICPC Balloons

import java.util.Scanner;

public class Q1703B {

  private static int balloons(int n, String str){
    int[] arr = new int[26];
    int score = 0;
    for(int i=0; i<n; i++){
      char ch = str.charAt(i);
      int index = ch - 'A';
      if(arr[index] == 0){
        arr[index] = 1;
        score += 2;
      }else{
        score += 1;
      }
    }
    return score;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();

    while(t-- > 0){
      int n = sc.nextInt();
      sc.nextLine();
      String str = sc.nextLine();
      int score = balloons(n, str);
      System.out.println(score);
    }
    sc.close();
  }
}
