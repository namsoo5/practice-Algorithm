import java.util.Arrays;
import java.util.Scanner;

//n개 수오름차순정렬
public class baek2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        for(int num : arr){
            System.out.println(num);
        }
    }
}
