import java.util.Arrays;
import java.util.Scanner;

//알파벳찾기
public class baek10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] count = new int[26];
        for(int i=0; i<count.length; i++){
            count[i] = -1;   //초기값 -1
        }

        //a = 97

        String s = scan.nextLine();
        char[] word = s.toCharArray();
        for(int i=0; i<word.length; i++){
            if( count[(int)word[i]-97] == -1){ //아직 단어가 안나왓을경우에만
                count[(int)word[i]-97] = i;
            }
        }
        //System.out.println(Arrays.toString(count));
        for(int i=0; i<count.length; i++){
            System.out.print(count[i]+" ");
        }
    }
}
