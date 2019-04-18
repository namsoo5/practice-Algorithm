import java.util.Scanner;

//전화거는데 필요한시간
public class baek5622 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        char[] dial = s.toCharArray();

        int time = 0;
        //A=65
        //65,66,67 /  68,69,70
        for(int i=0; i<dial.length; i++) {
            if(dial[i] == '1')
                time+=2;
            else if(dial[i] == '0')
                time+=11;
            else if(dial[i] == 'Z')
                time+=10;
            else if(dial[i] > 'R') //S부터 4자리로, 1씩밀림
                time += ((int) dial[i] - 65 - 1) / 3 + 3;
            else
                time += ((int)dial[i]-65)/3 + 3;  //번호마다 시간합
        }

        System.out.println(time);
    }
}
