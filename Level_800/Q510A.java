import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                for(int j=0; j<m; j++){
                    sb.append('#');
                }
            }
            else if(i%4 == 1){
                for(int j=0; j<m-1; j++){
                    sb.append('.');
                }
                sb.append('#');
            }
            else{
                sb.append('#');
                for(int j=1; j<m; j++){
                    sb.append('.');
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
