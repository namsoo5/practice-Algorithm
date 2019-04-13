import java.util.Scanner;

//2의제곱찾기
public class baek15917 {
    static int[] result;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int a[] = new int[q];
        result = new int[q];

        for(int i=0; i<q; i++){
            a[i] = scan.nextInt();
        }
        Square(a);

    }

    static void Square(int c[]) {
        for(int i=0; i<c.length; i++){
            StringBuilder s = new StringBuilder(Integer.toBinaryString(c[i]));
            if (s.indexOf("1") == s.lastIndexOf("1") ){
                System.out.println("1");  //거듭제곱인경우
            }else{
                System.out.println("0");
            }
        }
    }
}
