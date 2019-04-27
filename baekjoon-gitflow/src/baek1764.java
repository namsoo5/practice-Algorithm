import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

//듣도보도못한 사람 수
public class baek1764 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<String> al = new ArrayList<String>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        ArrayList<String> result = new ArrayList<String>();
        int n = scan.nextInt(); //듣도 못한사람
        int m = scan.nextInt();  //보도 못한사람
        scan.nextLine();  //공백제거

        for(int i=0; i<n; i++){
            hm.put(scan.nextLine(), 1);
        }

        for(int i=0 ; i<m; i++){
            String s = scan.nextLine();

            if(hm.get(s) != null){
                result.add(s);
                hm.remove(s);
            }

        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }


}
