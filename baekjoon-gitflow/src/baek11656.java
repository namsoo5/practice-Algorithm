import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 문자열 사전순 정렬
public class baek11656 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> al = new ArrayList<String>();
        String s = scan.nextLine();

        for(int i=0; i<s.length(); i++){
            al.add(s.substring(i, s.length()));
        }

        Collections.sort(al);
        for(int i =0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
