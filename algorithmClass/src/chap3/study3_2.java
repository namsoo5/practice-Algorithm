package chap3;

import java.util.Arrays;
import java.util.Comparator;

public class study3_2 {
     static PersonNameComparator Comparator = new PersonNameComparator();
     static void swap(Person[] a, int i, int j) {
        Person temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    /*선택정렬*/
    // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
     static int findMin(Person[] a, int start) {
        Person minValue = a[start];
        int minIndex = start;
        for (int i = start + 1; i < a.length; ++i) {
            if (Comparator.compare(a[i], minValue) < 0) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    //선택정렬
    // selection sort
    static void selectionSort(Person[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
            swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다
        }
    }

    // bubble sort
    static void bubbleSort(Person[] a) {
        for (int i = a.length - 1; i >= 1; --i) {
            boolean finish = true;  //바꿀 데이터가없을때 정렬을 스킵하기위한 트리거
            for (int j = 0; j < i; ++j) {
                if (Comparator.compare(a[j], a[j+1])>0) {
                    swap(a, j, j + 1);
                    finish = false;
                }
            }
            if (finish) break;
        }
    }

    //삽입정렬
    static void insertionSort(Person[] a) {
        for (int i = 1; i < a.length; ++i) {
            Person value = a[i];          // 삽입할 값 보관
            int j;
            for (j = i - 1; j >= 0; --j)  // 뒤로 이동
                if (Comparator.compare(a[j], value) > 0)
                    a[j + 1] = a[j];
                else
                    break;
            a[j + 1] = value;             // 값 삽입
        }
    }

    /* Main */
    public static void main(String[] args) {
        Person a[] = {new Person("홍길동", 18), new Person("임꺽정", 22), new Person("이몽룡", 17),
                new Person("전우치", 23), new Person("심청", 16), new Person("연흥부", 38)};

        // --- 정렬 --- //

        //bubbleSort(a);
        insertionSort(a);
        //selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}


class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int r = p1.name.compareTo(p2.name);  // 먼저 이름(name)을 비교한다.
        if (r != 0) return r;                // 이름이 같지 않다면, 이름 비교 결과를 리턴한다.
        return p1.age - p2.age;              // 이름이 같다면, 나이(age) 비교 결과를 리턴한다.
    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Person) == false) return false;
        Person p = (Person)obj;
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
    }

    @Override
    public String toString() {
        return String.format("Person{name=\"%s\", age=%d}\n", name, age);
    }

}
