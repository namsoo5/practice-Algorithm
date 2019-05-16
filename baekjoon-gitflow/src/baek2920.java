import java.util.Scanner;

//계이름 차례대로인지 찾기
public class baek2920 {
    public static void main(String[] args) {
        final int MAX_NUM = 8;
        int[] scale = new int[MAX_NUM];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<MAX_NUM; i++){
            scale[i] = Integer.parseInt(scan.next());
        }

        if(ascending(scale))
            System.out.println("ascending");
        else if(descending(scale)){
            System.out.println("descending");
        }else
            System.out.println("mixed");

    }

    static boolean ascending(int[] arr){
        int check = 1;
        for(int i=0; i<arr.length; i++){
            if(check++ != arr[i])
                return false;
        }
        return true;
    }

    static boolean descending(int[] arr){
        int check = 8;
        for(int i=0; i<arr.length; i++){
            if(check-- != arr[i])
                return false;
        }
        return true;
    }
}
