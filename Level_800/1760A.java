// Medium Number

import java.util.Scanner;

public class 1760A {
  private static int medium(int a, int b, int c){
    if((a>=b && a<=c) || (a<=b && a>=c)) return a;
    else if((b>=a && b<=c) || (b<=a && b>=c)) return b;
    else return c;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    while(t-- > 0){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int result = medium(a, b, c);
      System.out.println(result);
    }
  }
}
