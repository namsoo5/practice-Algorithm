package chap3;

import java.util.Arrays;

public class study3_1 {
    // 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    /*선택정렬*/
    // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
    static int findMin(String[] a, int start) {
        String minValue = a[start];
        int minIndex = start;
        for (int i = start + 1; i < a.length; ++i) {
            if (a[i].compareTo(minValue) < 0) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    //선택정렬
    // selection sort
    static void selectionSort(String[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
            swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다
        }
    }

    // bubble sort
    static void bubbleSort(String[] a) {
        for (int i = a.length - 1; i >= 1; --i) {
            boolean finish = true;  //바꿀 데이터가없을때 정렬을 스킵하기위한 트리거
            for (int j = 0; j < i; ++j) {
                if (a[j].compareTo(a[j + 1])>0) {
                    swap(a, j, j + 1);
                    finish = false;
                }
            }
            if (finish) break;
        }
    }

    //삽입정렬
    static void insertionSort(String[] a) {
        for (int i = 1; i < a.length; ++i) {
            String value = a[i];          // 삽입할 값 보관
            int j;
            for (j = i - 1; j >= 0; --j)  // 뒤로 이동
                if (a[j].compareTo(value) > 0)
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;             // 값 삽입
        }
    }


    public static void main(String[] args) {
        int[] b = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };
        String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
        int[] c = {17, 14, 11, 19 ,13};
        //selectionSort(a);
        //insertionSort(a);
        //bubbleSort(a);
        // ----- int ------ //
//         select(c);
        insert(c);
//        bubble(c);
        //[five, four, one, seven, six, three, two, zero]
        //System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
    }

    //선택정렬
    static void select(int[] b){

        for(int i=0; i<b.length-1; i++){
            System.out.println(Arrays.toString(b));
            int minvalue = b[i];
            int minindex = i;
            for(int j=i+1; j<b.length; j++) {
                if (minvalue > b[j]) {
                    minvalue = b[j];
                    minindex = j;

                }
            }
            int temp = b[i];
            b[i] = b[minindex];
            b[minindex] = temp;
        }
    }

    static void insert(int[] b){
        for(int i=1; i<b.length; i++){
            System.out.println(Arrays.toString(b));
            int value = b[i];
            int j;
            for( j= i-1; j>=0; j--){
                if(value<b[j]){ //앞에있는값이 크다면
                    b[j+1]= b[j]; //큰값 뒤로
                }else{
                    break; //앞은 이미 정렬되있음 없으면 스킵
                }
            }
            b[j+1] = value; //삽입할값

        }

    }

    static  void bubble(int[] b){
        for(int i=b.length-1; i>=1; i--){
            System.out.println(Arrays.toString(b));
            boolean complete = true;
            for(int j=0; j<i; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                    complete = false; //트리거되지않으면 정렬이 이미되있다는것
                }
            }
                if (complete)
                    break;

        }
    }

}
