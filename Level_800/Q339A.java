// Helpful Math

import java.util.*;
 
public class Q339A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder res = new StringBuilder("");
 
        ArrayList<Integer> arr = new ArrayList<>(); 
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) != '+'){
                arr.add(sb.charAt(i) - '0');
            }
        }
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++){
            if(i == arr.size()-1){
                res.append(arr.get(i));
            }else {
                res.append(arr.get(i) + "+");
            }
        }
        System.out.println(res);
    }
}
