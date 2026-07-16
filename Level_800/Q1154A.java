import java.util.Scanner;
import java.util.Arrays;

public class Q1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int d = nums[3];
        int a = d - nums[0];
        int b = d - nums[1];
        int c = d - nums[2];

        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}
