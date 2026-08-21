import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    StringBuilder sb = new StringBuilder("");
    String str = sc.nextLine();

    char prev = '\0';
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch == '.' && prev == '-'){
        sb.append("1");
      }
      else if(ch == '-' && prev == '-'){
        sb.append("2");
        prev = '\0';
        continue;
      }
      else if(ch == '.'){
        sb.append("0");
      }
      prev = ch;
    }
    System.out.println(sb);

    sc.close();
  }
}
