import java.util.Scanner;
//특정위치에 있는값찾기
public class baek1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        fountain(x);

    }

    static void fountain(int x) {

        int pos = 0;
        int i=1;

        while(true){
            pos += i;

            if(pos>=x){  // 1, 2, 3, 4.. 개 늘어남  x가 속한위치찾기
                break;
            }
            i++;
        }
        System.out.println(pos+","+i);
        int th =  pos - x;  //i번째 꽉찬위치 pos에서 th만큼 전으로이동

        if(i % 2 == 0){ //  b/a
            int a = 1 + th ;  //분모
            int b = i - th;  //분자
            System.out.println(b+"/"+a);
        }else {
            int a = i - th;  //분모
            int b = 1 + th;  //분자
            System.out.println(b+"/"+a);
        }

    }
}
