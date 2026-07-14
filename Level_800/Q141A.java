import java.util.Scanner;

public class AmuzingJoke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] arr = new int[26];

        for(int i=0; i<guest.length(); i++){
            char ch = guest.charAt(i);
            int index = ch - 'A';
            arr[index]++;
        }

        for(int i=0; i<host.length(); i++){
            char ch = host.charAt(i);
            int index = ch - 'A';
            arr[index]++;
        }

        for(int i=0; i<pile.length(); i++){
            char ch = pile.charAt(i);
            int index = ch - 'A';
            arr[index]--;
        }

        for(int i=0; i<26; i++){
            if(arr[i] != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

        sc.close();
    }
}
