import java.util.Scanner;

//특수알파벳 카운팅
public class baek2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] arr = s.toCharArray();

        int count=0;

        for(int i=0; i<arr.length; i++){ //마지막전까지검사
           // System.out.println("index: "+i);
            if(arr[i]=='c'){
                if(i+1<arr.length ) {
                    if (arr[i + 1] == '=' || arr[i + 1] == '-') {
                        count++;
                        i++;
                        continue;
                    }
                }
            }

            if(arr[i]=='d'){
                if( i+2<arr.length && arr[i+1]=='z' && arr[i+2]=='='){
                    count++;
                    i+=2;
                    continue;
                }else if(i+1<arr.length && arr[i+1]=='-'){
                    count++;
                    i++;
                    continue;
                }
            }

            if(i+1<arr.length) {
                if (arr[i] == 'l' && arr[i + 1] == 'j') {
                    count++;
                    i++;
                    continue;
                }

                if (arr[i] == 'n' && arr[i + 1] == 'j') {
                    count++;
                    i++;
                    continue;
                }

                if (arr[i] == 's' && arr[i + 1] == '=') {
                    count++;
                    i++;
                    continue;
                }

                if (arr[i] == 'z' && arr[i + 1] == '=') {
                    count++;
                    i++;
                    continue;
                }
            }

            count++;
        }
        System.out.println(count);
    }
}
