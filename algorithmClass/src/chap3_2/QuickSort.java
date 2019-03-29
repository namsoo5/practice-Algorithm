package chap3_2;
import java.util.*;
public class QuickSort {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    //기준값 보다 작으면 왼쪽 크면 오른쪽
    static int partition(int[] a, int start, int end) {
        int mid = (start+end)/2;
        swap(a, mid, end);
        int value = a[end];
        int i = start-1;
        for(int j=start; j<end; j++){
            if(value>a[j]){
                swap(a, ++i, j);
            }
        }
        swap(a, i+1, end);
        return i+1;
    }

    static void quickSort(int[] a, int start, int end){

        if(start>=end)
            return;
        int mid = partition(a, start, end);
        quickSort(a, start, mid-1);
        quickSort(a, mid+1, end);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.print(Arrays.toString(Arrays.copyOfRange(a, 0, a.length/2)) + " ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, a.length/2, a.length)));

    }
}
