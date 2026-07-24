import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = "helloworld";
        char[] a = str.toCharArray();

        int l = 0;
        int r = a.length-1;

        while(l < r){
            while(l < r && !isVowel(a[l])) l++;
            while(l < r && !isVowel(a[r])) r--;
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
