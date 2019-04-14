import java.util.Scanner;

//숫자구성에 필요한 세트구하기
public class baek1475 {
    public static void main(String[] args) {
        int[] set = new int[10];
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        for(int i=0; i<s.length(); i++) {
            int num = Integer.parseInt(s.substring(i,i+1));

            if(num == 6 || num == 9){
                if (set[6] > set[9]) {
                    set[6]--;
                    continue;
                } else if(set[6] < set[9]){
                    set[9]--;
                    continue;
                }
            }
            set[num]--;
        }
        int min = 0;
        for (int i=0; i<set.length; i++){
            if(set[i]<min){
                min = set[i];
            }
        }
        System.out.println(-min);


    }
}
