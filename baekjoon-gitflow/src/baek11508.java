import java.util.Arrays;
import java.util.Scanner;

//2+1 최소값구하기
public class baek11508 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);

        int sum=0;
        int check=1;
        for(int i=n-1; i>=0; i--){
            if(check%3 != 0)
                sum += a[i];
            check++;
        }

        System.out.println(sum);

    }
}
