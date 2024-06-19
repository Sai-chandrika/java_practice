package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swaping {


   public static int minimumSwaps(int[] arr) {
       int n = arr.length;
       int swaps = 0;

       for (int i = 0; i < n; i++) {
           while (arr[i] != i + 1) {
               int temp = arr[i];
               arr[i] = arr[temp - 1];
               arr[temp - 1] = temp;
               swaps++;
           }
       }
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]);
       }
       return swaps;
    }


    public static  void check(List<Integer> a){
        int swap=0;

        for (int i = 0; i < a.size(); i++) {
            while (a.get(i) != i + 1) {
                int temp = a.get(i);
                a.set(i, a.get(temp - 1));
                a.set(temp - 1, temp);
                swap++;
            }
        }


            System.out.println("Array is sorted in " + swap + " swaps.");


    }


    public static void main(String[] args) {
       int[] array={1,3,5,2,4,6,7,};
       int swapCount= minimumSwaps(array);
        System.out.println(  "swapCount : "+swapCount);
        for(int i=0; i<array.length ; i++) {
            System.out.println(array[i]);
        }

        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        check(a);
//        Scanner scanne = new Scanner(System.in);
//        System.out.println("enter array size :  ");
//        int t = scanne.nextInt();
//        System.out.println(t);
//        System.out.println("enter array values :  ");
//        int arr[] = new int[t];
//        for (int i = 0; i < t; i++) {
//            arr[i] = scanne.nextInt();
//        }
//        System.out.println("Array values: ");
//        for (int i = 0; i < t; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//                if (min > arr[i]) {
//                    min = arr[i];
//                }
//        }
//        System.out.println();
//        System.out.println("min " + min);
//        int swap=0;
//        for(int i = 0; i < arr.length - 1; i++) {
//            for(int j = 0; j < arr.length-i- 1; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swap++;
//                }
//            }
//        }
//
//        System.out.println("Sorted array:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }`
//        System.out.println(  "swap : "+swap);
    }

}






//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//         int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(Collectors.toList());
//
//        bufferedReader.close();
//
//       int swap = 0;
//
//
//        for (int i = 0; i < n; i++) {
//            int numberOfSwaps = 0;
//            for (int j = 0; j < n - 1; j++) {
//                if (a.get(j) > a.get(j + 1)) {
//                    int temp = a.get(j);
//                    a.set(j, a.get(j + 1));
//                    a.set(j + 1, temp);
//                    numberOfSwaps++;
//                    swap++;
//                }
//            }
//
//            if (numberOfSwaps == 0) {
//                break;
//            }
//        }
//
//        System.out.println("Array is sorted in " + swap + " swaps.");
//        System.out.println("First Element: " + a.get(0));
//        System.out.println("Last Element: " + a.get(n - 1));
//    }
//}