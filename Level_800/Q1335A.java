import java.util.Scanner;

public class Q1335A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int candy = sc.nextInt();
            int count = 0;

            if(candy%2 == 0){
                count = candy / 2 - 1;
            }else{
                count = candy / 2;
            }
            System.out.println(count);
        }
        sc.close();
    }
}

