package array;

import java.util.Scanner;

public class InputValues {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int size=s.nextInt();
        System.out.println("enter array values");
        int[] a=new int[size];
        for(int i=0; i<size;i++){
           a[i]=s.nextInt();
        }
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
