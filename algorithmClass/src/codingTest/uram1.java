package codingTest;

import java.util.Arrays;
import java.util.Scanner;

//금액 화폐전환
public class uram1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int money = scan.nextInt();
        int arr[] = new int[9];
        int won[] ={50000,10000,5000,1000,500,100,50,10,1};

        for(int i=0; i<arr.length; i++){
            arr[i] = money/won[i];
            money = money%won[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
