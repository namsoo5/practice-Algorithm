import java.util.Scanner;

//OX 점수계산
public class baek8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        int[] result = new int[n];
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = scan.nextLine();
        }

        for (int i=0; i<n; i++){
            result[i] = score(s[i]);
            System.out.println(result[i]);
        }
    }

    //OX판별
    static int score(String s){
        char[] arr = s.toCharArray();
        int count = 1;
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='O'){
                result += count++;
            }else {
                count = 1;
            }
        }
        return result;
    }
}
