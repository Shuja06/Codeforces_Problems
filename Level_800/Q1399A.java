// Remove Smallest

import java.util.Scanner;
import java.util.Arrays;

public class Q1399A {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){
      int n = sc.nextInt();
      int[] a = new int[n];

      for(int i=0; i < n; i++){
        a[i] = sc.nextInt();
      }
      
      int l = 0;
      int r = 1;

      Arrays.sort(a);

      if(a.length == 1) {
        System.out.println("YES");
        continue;
      }
      while (r < a.length){
        if(Math.abs(a[l] - a[r]) > 1){
          System.out.println("NO");
          break;
        }
        if(r == a.length-1){
          System.out.println("YES");
        }
        l++;
        r++;
      }
    }

    sc.close();
  }
}
