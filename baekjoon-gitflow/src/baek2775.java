import java.util.Scanner;

//집 거주민수찾기
public class baek2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] room = new int[15][15];

        //0층 거주민수
        for(int i=0; i<room[0].length; i++){
            room[0][i] = i;
        }

        //층별 거주민수
        for(int i=1; i<room.length; i++){
            for(int j=1; j<room[i].length; j++){
                room[i][j] = room[i][j-1] + room[i-1][j];
            }
        }
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(room[k][n]);
        }


    }
}
