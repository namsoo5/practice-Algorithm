import java.util.Arrays;
import java.util.Scanner;

//숫자정렬
public class baek1427 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
