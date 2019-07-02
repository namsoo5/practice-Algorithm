import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int count = 1;

        while (count <= t) {
            int zero = 0;
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] nlist = new int[n];

            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                nlist[i] = num;
                if (num == 0) {
                    zero++;
                }
            }

            int result = manyNum(nlist, k, zero);

          //  System.out.println(Arrays.toString(nlist));
            System.out.println("#" + count + " " + result);
            count++;
        }
    }

    public static int manyNum(int[] arr, int kind, int zero) {

        if (zero == arr.length) {
            return arr.length - kind + 1;
        }

        int[] count = new int[kind+1]; //카운트
        boolean isZero = false; //0인상태인지
        int before=0;

        for(int i=0; i<arr.length; i++){
            int num = arr[i];

            if(num==0){
                isZero = true;
                count[0]++;
                if(i == arr.length-1){
                    count[before] += count[0];
                }
            }else{
                if(isZero){
                    if(before == num) {
                        count[num] += count[0] + 1;
                    }else{
                        if(before != 0) {
                            count[before] += count[0] - (num - before - 1);
                        }
                        count[num] += count[0] - (num-before-1)+1;
                    }
                    count[0] = 0;
                }else {
                    count[num]++;
                }
                before = num;
                isZero = false;
            }

        }
        int max=0;
       // System.out.println(Arrays.toString(count));
        for(int i=1; i<count.length; i++){
            if(max<count[i]){
                max = count[i];
            }
        }
        return max;
    }
}

/*
물에 젖어 색종이가 버려진 칸을 0 으로 표시한다
물을 쏟기 전 가장 많은 색깔의 색종이가 최대 몇 장이 있었을지를 유추하는 프로그램

첫 줄에 테스트케이스 T 가 주어지고, 그 다음 줄부터 T개의 테스트 케이스 가 주어진다. 각 케이스는 두 줄로 구성되어 있으며, 첫 줄에는 N 과 K 가 공백으로 구분되어 차례대로 주어지고, 두 번째 줄에는 물에 젖어 일부의 색종이가 버려진 상태에서의 N 개의 색종이의 색깔 번호(빈 칸일 경우 0)가 왼쪽부터 차례대로 공백으로 구분되어 주어진다.

[출력]
총 T 줄이 출력된다. 각 줄은 #x로 시작하고 (x는 테스트 케이스 번호, 1부터 시작) 공백을 하나 둔 후 유추가 가능한 가장 많은 색깔의 색종이의 최대 장수를 출력한다.

5
9 3
1 1 2 2 2 2 3 3 3
9 3
1 1 2 0 0 2 3 3 3
9 3
0 1 2 2 0 0 3 0 0
9 3
0 0 0 0 0 0 0 0 0
10 4
0 0 2 0 0 0 0 0 4 0

 */