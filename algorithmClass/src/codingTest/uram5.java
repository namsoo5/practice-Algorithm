package codingTest;

import java.util.Arrays;
import java.util.Scanner;

//해당숫자까지 박수쳐아하는 횟수
public class uram5 {
    static int count=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        solution(number);
        System.out.println("박수개수:"+count);
    }

    static void solution(int cnum){

        for (int i=1; i<=cnum; i++){
            char[] c = String.valueOf(i).toCharArray();
            for(int j=0; j<c.length; j++) {
                if (c[j] == '3' || c[j] == '6' || c[j] == '9') {
                    count++;
                }
            }
        }
    }
}
