import java.util.ArrayList;
import java.util.Scanner;

//언제끝나는조건인지...?
public class baek10951 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        while(true) {
            a.add(scan.nextInt());
            b.add(scan.nextInt());

            if( a.get(a.size()-1)>=10 || a.get(a.size()-1)<=0)
                break;
        }
        for(int i=0; i<a.size(); i++){
            int sum = a.get(i)+b.get(i);
            System.out.println(sum);
        }
    }
}
