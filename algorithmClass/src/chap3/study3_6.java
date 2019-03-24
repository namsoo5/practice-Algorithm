package chap3;

public class study3_6 {
    public static void main(String[] args) {
        int[] a =  {0,0,0,1,1,0,1,1,0,1,0,1};
        int[] count = {0, 0};
        for (int i=0; i<a.length; i++){
            if(a[i] == 0){
                count[0]++;
            }else
                count[1]++;
        }

        for(int i=0; i<a.length; i++) {
            if(count[0]>0) {
                System.out.print("0 ");
                count[0]--;
            }
            else if (count[1]>0){
                System.out.print("1 ");
                count[1]--;
            }
        }
    }
}
