package chap1;

import java.util.Random;

public class study1_7 {
    static void print(int[] a) { //o(n)
        for (int i : a)
            System.out.printf("%d ", i);
    }

    static void swap(int[] a, int i, int j) { // o(1)
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    static void sort(int[] a) {  //n^2
        for (int i = 0; i < a.length - 1; ++i)
            for (int j = i + 1; j < a.length; ++j)
                if (a[i] > a[j])
                    swap(a, i, j);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i) //o(n)
            a[i] = random.nextInt(20);

        sort(a);
        print(a);

    }

}
