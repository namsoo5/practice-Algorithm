import java.util.Scanner;

//날짜구하기
public class baek1476 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int e = scan.nextInt();
        int s = scan.nextInt();
        int m = scan.nextInt();

        int a=1, b=1, c=1;
        int year = 1;
        while(true){
            if(a==e && b==s && c==m){
                break;
            }
            a++;
            b++;
            c++;
            if(a>15){
                a=1;
            }
            if(b>28){
                b=1;
            }
            if(c>19){
                c=1;
            }
            year++;

        }
        System.out.println(year);
    }
}
