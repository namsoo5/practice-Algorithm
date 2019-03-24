package chap3;

import java.util.Arrays;

public class study3_5 {
    public static void main(String[] args) {
        char[] a =  {'c','a','f','b','t','s','d','p','z','i','a','a'};

        //각 소문자에해당하는 값 카운트
        int[] count = new int[26];
        for(int i=0; i<a.length; i++){
            int pos = a[i] - (char)97;
            count[pos]++;
        }

        System.out.println(Arrays.toString(count));
        //카운트개수만큼 소문자출력
        for(int i=0; i<26; ) {
            if (count[i] > 0) {
                System.out.print((char) (97 + i) + " ");
                count[i]--;
            }
            else
             i++;
        }

    }
}
