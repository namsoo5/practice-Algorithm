import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//좌표정렬, x가 작은게 먼저나오도록
public class baek11650 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] pos = new int[n][2];  //x,y저장

        for(int i=0; i<n; i++){
            pos[i][0] = scan.nextInt();
            pos[i][1] = scan.nextInt();
        }

        Arrays.sort(pos, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]>o2[0]){
                    return 1;   //o1이 크면 뒤로
                }else if(o1[0]<o2[0]){
                    return -1; //o1이 작으면 앞으로
                }else //그다음조건으로 y값 비교
                    return o1[1] > o2[1] ? 1 : -1;
            }
        });

        for (int i=0; i<n; i++){
            System.out.println(pos[i][0]+" "+pos[i][1]);
        }
    }
}
