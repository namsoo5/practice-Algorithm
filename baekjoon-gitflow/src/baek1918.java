import java.util.Scanner;
import java.util.Stack;

//후위연산
public class baek1918 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        char[] infix = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<infix.length; i++){
            switch (infix[i]){
                case '(':
                    //push
                    stack.push(infix[i]);
                    break;
                case ')':
                    // '(' 나올때까지 pop
                    while(true){
                        char c = stack.pop();
                        if(c=='(')
                            break;
                        System.out.print(c);

                    }
                    break;
                case '+':
                case '-':
                    //스텍안의 연산자 모두 pop 자신만 push
                    while(!stack.isEmpty()) {
                        if(stack.peek() == '(') // '('는 빼면안됨
                            break;
                        System.out.print(stack.pop());
                    }
                    stack.push(infix[i]);
                    break;
                case '/':
                case '*':
                    //우선순위같거나 크면 pop
                    //클순없고 같은경우만 생김
                    while(!stack.isEmpty()) {
                        char c = stack.peek();
                        if (c == '/' || c == '*')
                            System.out.print(stack.pop());
                        else
                            break;
                    }
                    stack.push(infix[i]);
                    break;
                default:   //일반 피연산자는 바로 출력
                    System.out.print(infix[i]);
            }
        }
        while(!stack.isEmpty()){  //남은스텍 다빼주기
            System.out.print(stack.pop());
        }
    }
}
