import java.util.Scanner;

public class baek2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<n-i) {
                    System.out.print("*");
                }else{
                    break;
                }
            }
            System.out.println();
        }
    }
}
