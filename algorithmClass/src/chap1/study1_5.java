package chap1;

public class study1_5 {
    static void print(int[] a) {
        for (int i : a)
            System.out.printf("%d ", i);
    }

    //index 한칸씩뒤로밀고 index위치에 value삽입
    static void insert(int[] a, int index, int value) {

        int temp = a[index]; //초기 해당위치 배열값 저장
        a[index] = value;  // 변경값 삽입
        for( int i=index; i<a.length-1; i++) {
            int next = a[i+1];
            a[i+1] = temp;
            temp = next;

        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = i;

        insert(a, 5, -99);

        print(a);
    }

}
