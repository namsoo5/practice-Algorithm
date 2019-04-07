import java.util.Scanner;

public class baek10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] sum = new int[t];
        for (int i=0; i<t; i++){
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }

        for (int i=0; i<t; i++){
            sum[i] = a[i]+b[i];
            System.out.println(sum[i]);
        }

    }
}
