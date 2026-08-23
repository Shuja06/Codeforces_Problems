// Creating Words

import java.util.Scanner;

public class 1985A {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    while(t-- > 0){
      String a = sc.next();
      String b = sc.next();

      StringBuilder sb_a = new StringBuilder(a);
      StringBuilder sb_b = new StringBuilder(b);

      char temp = sb_a.charAt(0);
      sb_a.setCharAt(0, sb_b.charAt(0));
      sb_b.setCharAt(0, temp);

      System.out.println(sb_a + " " + sb_b);
    }
  }
}
