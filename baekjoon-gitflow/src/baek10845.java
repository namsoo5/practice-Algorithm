import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//queue만들고 동작 명령어입력
public class baek10845 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue q = new LinkedList();
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String s = scan.next();
            switch (s){
                case "push":
                    int num1 = scan.nextInt();
                    ((LinkedList) q).add(num1);
                    break;
                case "pop":
                    if(q.size() != 0) {
                        int num2 = (int) ((LinkedList) q).removeFirst();
                        System.out.println(num2);
                    }else
                        System.out.println(-1);
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if(q.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "front":
                    if(q.size() != 0){
                        int num3 = (int) ((LinkedList) q).getFirst();
                        System.out.println(num3);
                    }else
                        System.out.println(-1);
                    break;
                case "back":
                    if(q.size() != 0){
                        int num4 = (int)((LinkedList) q).getLast();
                        System.out.println(num4);
                    }else
                        System.out.println(-1);
                    break;
                default :
                    return;
            }
        }

    }
}
