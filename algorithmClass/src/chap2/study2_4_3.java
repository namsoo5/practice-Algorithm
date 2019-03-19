package chap2;

import java.util.Scanner;

public class study2_4_3 {

    static void print1(int n) {

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(j>=n-(i+1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void print2(int n, int i, int j) {

        if(n<=i) {
            return;
        }

        if(j>=n) {  //n만큼출력후 다음줄로 이동
            System.out.println();
            print2(n, i+1, 0);
        }else if( j >= n-(i+1) ) {
            System.out.print("*");
            print2(n, i, j + 1);
        }else {
            System.out.print(" ");
            print2(n, i, j+1);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("행 수를 입력하시오: ");
            int n = scanner.nextInt();
            print1(n);
            System.out.println();
            print2(n, 0, 0);
        }
    }

}
