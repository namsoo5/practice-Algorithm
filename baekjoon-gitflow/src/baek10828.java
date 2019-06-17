import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//명령어 입력으로 스텍사용
public class baek10828 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());

            for(int i=0; i<n; i++) {
                String s = bf.readLine();
                StringTokenizer st = new StringTokenizer(s);

                String command = st.nextToken();
                if (command.equals("push")){
                    stack.push(Integer.parseInt(st.nextToken()));
                }else if (command.equals("pop")){
                    if(stack.isEmpty()) {
                        System.out.println(-1);
                        continue;
                    }
                    System.out.println(stack.pop());
                }else if (command.equals("size")){
                    System.out.println(stack.size());
                }else if (command.equals("empty")){
                    if(stack.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                }else if(command.equals("top")){
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.peek());
                }
            }


        }catch(IOException e){
            System.out.println(e);
        }
    }
}
