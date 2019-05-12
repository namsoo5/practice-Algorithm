package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Arrays.toString(solution(n)));
    }

    public static String[] solution(int N) {
        List<String> result = pair(N);
        String[] answer = new String[result.size()];

        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }

    static List<String> pair(int n) {
        List<String> ans = new ArrayList();
        recurse(ans, "", 0, 0, n);
        return ans;
    }

    static void recurse(List<String> ans, String cur, int open, int close, int n){

        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }
        if (open < n) {
            recurse(ans, cur + "(", open + 1, close, n);
        }
        if (close < open) {
            recurse(ans, cur + ")", open, close + 1, n);
        }
    }
}
