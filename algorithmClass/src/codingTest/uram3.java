package codingTest;

import java.util.Arrays;
import java.util.Scanner;

// 알파벳 거꾸로 적용
public class uram3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String w = scan.nextLine();
        char[] word = w.toCharArray();
        char[] change = new char[word.length];

        System.out.println("입력: "+Arrays.toString(word));
        solution(word, change);
        System.out.println("결과: "+Arrays.toString(change));
    }


    static void solution(char[] w, char[] c){
        for(int i=0; i<w.length; i++) {
            if(w[i] >= 'a' && w[i] <= 'z') {
                c[i] = (char) ('z' - (w[i] - 'a'));
            }else if(w[i] >= 'A' && w[i] <= 'Z')
                c[i] = (char) ('Z' - (w[i] - 'A'));
        }
    }
}
