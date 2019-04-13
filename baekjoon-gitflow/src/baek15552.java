import java.io.*;
import java.util.StringTokenizer;

//빠른 연산
public class baek15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String s = bf.readLine(); //String
        int n = Integer.parseInt(s);
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++) {
            s = bf.readLine(); //String
            StringTokenizer st = new StringTokenizer(s);
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        int sum=0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
        for(int i=0; i<n; i++) {
            sum = a[i] + b[i];
            bw.write(sum + "\n");//출력
        }
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close();

    }
}
