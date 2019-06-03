import java.util.Scanner;

class OddXor {
    static int Answer;

    public static void main(String args[]) throws Exception	{

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            Answer = 0;
            int n = sc.nextInt();

            for( int i=0; i<n; i++){
                int num = sc.nextInt();
                Answer = Answer ^ num;
            }

            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}