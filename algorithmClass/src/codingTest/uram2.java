package codingTest;

import java.util.Arrays;
import java.util.Scanner;

//이미분양된토지와 겹치지않고 식수원과 겹치는 영역만 true반환하기
//(x1,y1,x2,y2) 에서 x1이 무조건작다고 가정
public class uram2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("land, well 차례대로 입력");
        int l = scan.nextInt(); //분양된토지개수
        int w = scan.nextInt(); //식수원개수

        int lands[][] = new int[l][4]; //이미 분양된토지
        int wells[][] = new int[w][4]; //식수원위치
        int point[] = new int[4]; //분양토지위치

        System.out.println("land입력");
        for (int i = 0; i < lands.length; i++) {
            for (int j = 0; j < lands[0].length; j++) {
                lands[i][j] = scan.nextInt();
            }
        }
        System.out.println("well입력");
        for (int i = 0; i < wells.length; i++) {
            for (int j = 0; j < wells[0].length; j++) {
                wells[i][j] = scan.nextInt();
            }
        }
        System.out.println("point입력");
        for (int i = 0; i < point.length; i++) {
            point[i] = scan.nextInt();
        }


        ///출력///
        for (int i = 0; i < lands.length; i++) {
            System.out.print(Arrays.toString(lands[i]) + "   ");
        }
        System.out.println();
        for (int i = 0; i < wells.length; i++) {
            System.out.print(Arrays.toString(wells[i]) + "   ");
        }
        System.out.println();
        System.out.println(Arrays.toString(point));

        System.out.println("결과:" + solution(lands, wells, point));
    }

    static boolean solution(int land[][], int well[][], int p[]) {

        for(int i=0; i<land.length; i++) {
            if((land[i][0] > p[0] && land[i][0] < p[2]) && (land[i][1] > p[1] && land[i][1] < p[3])){
                return false;
            }
        }
        for(int i=0; i<well.length; i++) {
            if((well[i][0] > p[0] && well[i][0] < p[2]) && (well[i][1] > p[1] && well[i][1] < p[3])){
                return true;
            }
        }
        return false;
    }

}

/*
3 2
10 0 30 5 0 30 20 50 30 30 40 40
15 15 25 25 40 10 50 20
10 10 30 30
 */