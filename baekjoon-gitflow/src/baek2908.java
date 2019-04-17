import java.util.Scanner;
import java.util.Stack;

//거꾸로숫자 비교하기
public class baek2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        Stack<String> st1 = new Stack();
        Stack<String> st2 = new Stack();

        for(int i=0; i<a.length(); i++) {
            st1.push(a.substring(i, i+1));
            st2.push(b.substring(i, i+1));
        }

        int ca=0;
        int cb=0;

        //스텍에서 빼면서 거꾸로 값반환
        for(int i=0; i<a.length(); i++) {
            ca += (Integer.parseInt(st1.pop()) * Math.pow(10, 2-i));
            cb += (Integer.parseInt(st2.pop()) * Math.pow(10, 2-i));
        }

        if(ca>cb){
            System.out.println(ca);
        }else
            System.out.println(cb);

    }
}
