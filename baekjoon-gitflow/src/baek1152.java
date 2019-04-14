import java.util.Scanner;
import java.util.StringTokenizer;

//공백기준으로 단어나누기
public class baek1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count =0;

        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()){
            st.nextToken();
            count++;
        }

        System.out.println(count);

    }
}
