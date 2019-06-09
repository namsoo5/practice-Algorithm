import java.util.Scanner;
import java.util.Stack;

// ( ) 짝맞추기
public class baek9012 {
    static Stack<Character> stack = new Stack<Character>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = scan.nextLine();
        }

        for(int i=0; i<s.length; i++){
            stack.clear();
            if(check(s[i])){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }

    }

    public static boolean check(String s){
        for(int j=0; j<s.length(); j++){
            if(s.charAt(j) == '('){
                stack.push('(');
            }else if(s.charAt(j) == ')'){
                if(stack.isEmpty()) {  //규칙이상
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) //남아있는경우 짝이안맞음
            return false;

        return true;
    }

}
