import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2751 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //Scanner보다속도향상

        try {
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(bf.readLine());
            }

            quickSort(arr, 0, n - 1);
            for (int num : arr) {
                System.out.println(num);
            }
        } catch (IOException e) {
            System.out.println("buffer error");
        }
    }

    static int partition(int[] arr, int start, int end){
        int mid = (start+end) / 2;
        swap(arr, mid, end);
        int pivot = arr[end];  //기준값 중간값

        int i=start-1;
        for(int j=start; j<end; j++){
            if(arr[j]<pivot){  //기준값보다 작으면 왼쪽
                swap(arr, ++i, j);
            }
        }
        swap(arr, i+1, end); // 기준값 원위치
        return i+1;
    }

    //퀵정렬
    static void quickSort(int[] arr, int start, int end){
        if(start>=end)
            return;
        int mid = partition(arr, start, end);
        quickSort(arr, start, mid-1);
        quickSort(arr, mid+1, end);

    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
