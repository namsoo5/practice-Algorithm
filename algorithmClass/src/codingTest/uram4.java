package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class uram4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] pobi = new int[2];
        int[] crong = new int[2];
        System.out.println("포비, 크롱순으로 페이지입력");
        pobi[0] = scan.nextInt();
        pobi[1] = scan.nextInt();
        crong[0] = scan.nextInt();
        crong[1] = scan.nextInt();

        if(pobi[0]!=pobi[1]-1){
            System.out.println("-1"); //예외
            return;
        }else if(crong[0]!=crong[1]-1){
            System.out.println("-1");
            return;
        }

        System.out.println(Arrays.toString(pobi));
        System.out.println(Arrays.toString(crong));
        System.out.println(solution(pobi,crong));
    }

    static int solution(int[] p, int[] c){
        int pmax=0;
        int cmax=0;
        for(int i=0; i<p.length; i++) {
            int sum = plus(p[i]);
            int multi = multi(p[i]);

            if(pmax < sum){
                pmax = sum;
            }
            if(pmax < multi){
                pmax = multi;
            }
            System.out.println("p: "+(i+1)+":"+pmax);
        }
        for(int i=0; i<p.length; i++) {
            int sum = plus(c[i]);
            int multi = multi(c[i]);
            if(cmax < sum){
                cmax = sum;
            }
            if(cmax < multi){
                cmax = multi;
            }
            System.out.println("c: "+(i+1)+":"+cmax);
        }


        if(cmax<pmax){
            return 1;
        }else if(cmax>pmax){
            return 2;
        }else if(cmax==pmax) {
            return 0;
        }else
            return -1;
    }
    static int plus(int v){
        char[] val = String.valueOf(v).toCharArray();
        int sum=0;
        for(int a: val){
            sum += (a-'0');
            //System.out.println("sum "+sum);
        }
        return sum;
    }

    static int multi(int v){
        char[] val = String.valueOf(v).toCharArray();
        int multi=1;
        for(int a:val){
            multi *= (a-'0');
           // System.out.println("multi: "+multi);
        }
        return multi;
    }
}
