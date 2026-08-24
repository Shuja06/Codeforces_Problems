// Required Rmainder

import java.util.Scanner;

public class 1374A {

  private static int remainder(int x, int y, int n){
    return x * ((n - y) / x) + y;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    while(t-- > 0){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();

      int res = remainder(x, y, n);
      System.out.println(res);

    }
  }
}
