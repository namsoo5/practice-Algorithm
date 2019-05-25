import java.util.Scanner;

//서로다른 나머지 몇개인가 출력
public class baek3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //나머지값저장 배열
        int[] count = new int[42];
        int result = 0;

        for(int i=0; i<10; i++){
            int num = scan.nextInt();
            count[num%42]++;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                result++;
            }
        }
        System.out.println(result);
    }
}
