import java.io.*;
import java.util.StringTokenizer;

//주어진 두배열 합치기
public class baek11728 {
    public static void main(String[] args) {
        try {
            //입력이 100만개이므로 속도향상을위해 bf사용
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            int[] result = new int[n+m];

            StringTokenizer a = new StringTokenizer(bf.readLine());
            int i=0;
            while (a.hasMoreTokens()){
                arr1[i++] = Integer.parseInt(a.nextToken());
            }
            StringTokenizer b = new StringTokenizer(bf.readLine());
            i=0;
            while (b.hasMoreTokens()){
                arr2[i++] = Integer.parseInt(b.nextToken());
            }

            int index1 =0;
            int index2 =0;
            i = 0;
            while(index1<n && index2<m) {   //두배열중 작은값 먼저채우기
                if (arr1[index1] >= arr2[index2]) {
                    result[i++] = arr2[index2++];
                } else if (arr1[index1] < arr2[index2]) {
                    result[i++] = arr1[index1++];
                }
            }
            //남은배열 넣어주기
            while (index1 < n) {
                result[i++] = arr1[index1++];
            }
            while(index2 < m){
                result[i++] = arr2[index2++];
            }

            //출력데이터량이 많으므로 속도향상을위해사용
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(i=0; i<result.length; i++){
                bw.write(result[i]+" ");
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
            System.out.println("bf error");
        }
    }
}
