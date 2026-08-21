import java.util.Scanner;

public class Q703A {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    int m_cnt = 0;
    int c_cnt = 0;

    while(t-- > 0){
      int m = sc.nextInt();
      int c = sc.nextInt();

      if(m > c){
        m_cnt++;
      }else if(c > m){
        c_cnt++;
      }
    }

    if(m_cnt > c_cnt){
      System.out.println("Mishka");
    }
    else if(c_cnt > m_cnt){
      System.out.println("Chris");
    }else{
      System.out.println("Friendship is magic!^^");
    }

    sc.close();
  }
}
