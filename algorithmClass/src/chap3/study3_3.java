package chap3;

import java.util.Arrays;

public class study3_3 {
    public static void main(String[] args) {
        int a[] = {8, 4, 2, 6, 9 ,3, 5, 7, 1, 0};

        numsort(a);
        sort(a);
        System.out.println(Arrays.toString(a));
    }


    //짝수앞에 홀수뒤에정렬
    static void sort(int[] a){
        int start=0;
        int end=a.length-1;
        for(;;){

            if(start > end)
                break;

            if(a[start] % 2 == 0 ) { //짝수
                start++;
            }else if(a[end]%2 == 1) { //홀수
                end--;
            }else{
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
    }

    //숫자정렬(insert sort사용)
    static void numsort(int[] a){
        for(int i=1; i<a.length; i++){
            int value = a[i]; //삽입할값
            int j;
            for(j=i-1; j>=0; j--){
                if(a[j]>value){
                    a[j+1] = a[j]; //한칸씩뒤로 미루기
                }else
                    break; //앞은 이미 정렬되어잇음
            }
            a[j+1] = value; //삽입
        }
    }
}
