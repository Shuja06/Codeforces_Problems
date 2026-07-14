import java.util.Scanner;
import java.util.HashSet;

public class AntonLetters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                set.add(str.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
