import java.util.ArrayList;
import java.util.Scanner;

public class baek1316 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.nextLine();
        for( int i=0; i<n; i++) {
            al.add(scan.nextLine());
        }

        int count = 0;
        for (String word : al) {
            if (groupWord(word)){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean groupWord(String s){
        boolean check[] = new boolean[26];
        char[] word = s.toCharArray();

        check[(int)word[0] - 97] = true;

        for(int i=1; i<word.length; i++){

            if (check[word[i]-97] && word[i] != word[i-1]){  //이미나왓고, 앞과 글자가다르다면
                return false;
            }

            if (check[(int)word[i]-97] == false) { //처음나온경우
                check[(int)word[i] - 97] = true;
            }


        }
        return true;
    }
}
