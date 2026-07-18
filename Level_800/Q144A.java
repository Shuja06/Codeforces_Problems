import java.util.Scanner;

public class Q144A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int minSwap = minimulSwap(n, arr);
        System.out.println(minSwap);
    }

    public static int minimulSwap(int n, int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        int largeIndex = 0;
        int smallIndex = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
                largeIndex = i;
            }
            if(arr[i] <= smallest){
                smallest = arr[i];
                smallIndex = i;
            }
        }

        int sum = (largeIndex - 0) + (n-1 - smallIndex);

        if(largeIndex > smallIndex){
            return sum - 1;
        }

        return sum;
    }
}
