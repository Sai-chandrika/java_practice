package array;

import java.util.ArrayList;
import java.util.List;

public class MinValue {

    public static int minValue(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;

    }

    public static void sorting(int a[]) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int k:a) {
            System.out.println(k + " ");
        }
    }


    public static void minimumBribes(List<Integer> q) {

        int bribes = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }



    public static void main(String[] args) {
        MinValue arrayTest = new MinValue();
        int a[] = {10, 5, 20, 23, 45};
        int minValue = arrayTest.minValue(a);
        System.out.println(minValue);
        sorting(a);
        List<Integer> integers=new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(1);
        integers.add(3);
        integers.add(4);
        minimumBribes(integers);
    }
}
