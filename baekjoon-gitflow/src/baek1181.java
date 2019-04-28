import java.util.*;

//단어짧은순, 같으면 사전순정렬
public class baek1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        HashSet<String> hs = new HashSet<String>();
        //중복피하기위해 hashset사용

        for(int i=0; i<n; i++) {
            hs.add(scan.nextLine());   //중복안들어감
        }

        ArrayList<String> al = new ArrayList<String>(hs);  //ArrayList로변환

        Collections.sort(al, new Comparator<String>() {  //새로운 정렬기준생성
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;  //o1길이가 길면 뒤로
                }else if (o1.length() < o2.length()){
                    return -1;  //o1길이가 짧으면 앞으로
                }else
                    return o1.compareTo(o2);  //길이같으면 알파벳순
            }
        });

        for(String s : al){
            System.out.println(s);
        }
    }
}
