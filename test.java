//핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다.
import java.util.*;
public class test{
    static long arr[] = new long[80];

    public static long solution(int n){

        if(n==0)
            return 0;
        if(n==1)
            return 1;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n-2] + arr[n-1];
    }
    public static void main(String[] args){
        arr[0] = 0;
        arr[1] = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long num = solution(n);
        System.out.println(n+"번째 피보나치 수는"+ num + " 이다.");
    }


    /*재귀
     public static long solution(int n){

        if(n==0)
            return 0;
        if(n==1)
            return 1;


        return solution(n-1) + solution(n-2);
    }
     */
}