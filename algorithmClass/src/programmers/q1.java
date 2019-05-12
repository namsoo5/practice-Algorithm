package programmers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        StringTokenizer st = new StringTokenizer(a, "[,]");

        int n = st.countTokens();
        int[] s = new int[n];


        int index=0;
        while(st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            s[index++] = value;
        }
        System.out.println(solution(s));
    }

    public static int solution(int[] s){
            int answer = 0;

            Arrays.sort(s);
        System.out.println(Arrays.toString(s));
            int index = 0;

            int sum=0;
            for(int i=s.length-1; i>=0; i--){

                if(index>i)
                    break;

                if(s[i] == 4){
                    answer++;
                    continue;
                }
                if(i!=index && s[i] + s[index] == 4){
                    answer++;
                    index++;
                    continue;
                }

                int val = s[i];
                if(sum+val > 4){
                    answer++;
                    continue;
                }

                sum += val;
                if(sum==4){
                    sum=0;
                    continue;
                }
                if(sum==val || sum>4)
                    answer++;
            }

            return answer;
        }
}
