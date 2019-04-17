import java.util.ArrayList;
import java.util.Scanner;

//원하는 수만큼 문자반복하기
public class baek2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<String> s = new ArrayList<String>();

        int n = scan.nextInt();

        for(int i=0; i<n; i++) {
            p.add(scan.nextInt());
            s.add(scan.next());
        }

      //  System.out.println(p);
      //  System.out.println(s);


        for(int i=0; i<n;i++){  // 문자열 개수만큼반복
            int count =0;  //반복하기위한 변수
            for(int j=0; j<s.get(i).length();){ //문자열길이만큼실행
                System.out.print(s.get(i).charAt(j));

                count++;
                if(count==p.get(i)){  //반복개수 체크
                    j++;   //다음문자 반복
                    count=0;
                }
            }
            System.out.println();
        }


    }
}
