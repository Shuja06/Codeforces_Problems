// Good Kid

import java.util.Scanner;

public class 1873B {

  private static int product(int[] a, int n){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      int prod = 1;
      for(int j=0; j<n; j++){
        if(i == j){
          prod *= a[j]+1;
        }else{
          prod *= a[j];
        }
      }
      max = Math.max(max, prod);
    }
    return max;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    while(t-- > 0){
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
      }
      int result = product(a, n);
      System.out.println(result);
    }
  }
}
