import java.util.Scanner;

public class Q785A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int sum = 0;

        for(int i=0; i<n; i++){
            String str = sc.nextLine();

            if(str.equals("Tetrahedron")){
                sum += 4;
            }else if(str.equals("Cube")){
                sum += 6;
            }else if(str.equals("Octahedron")){
                sum += 8;
            }else if(str.equals("Dodecahedron")){
                sum += 12;
            }else if(str.equals("Icosahedron")){
                sum += 20;
            }
        }

        System.out.println(sum);
    }
}
