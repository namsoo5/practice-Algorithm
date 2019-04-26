import java.util.Scanner;

//단어안에 많이존재하는 알파벳
public class baek1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int[] count = new int[26];
        char[] arr = s.toCharArray();

        for(int i =0; i<arr.length; i++){
            if((int)arr[i] < 97){ //대문자인경우
                count[(int)arr[i]-65]++;
            }else{
                count[(int)arr[i]-97]++;
            }
        }

        int max = 0;
        int index = 0;
        for(int i =0; i<count.length; i++){
            if(max<count[i]) {
                max = count[i];
                index = i;
            }
            else if(max==count[i]){
                index = -1;  //같은 문자열 잇을시 구분
            }
        }
        char result = index<0 ? '?' : (char)(index+65); //대문자로출력
        System.out.println(result);
    }
}
