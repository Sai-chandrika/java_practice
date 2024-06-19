package prctice_interview_question_most;

import java.util.LinkedList;

public class ReverseArray {



    public static int[] reverseArray(int[] a){
        for(int i=a.length-1;i>=0; i--){
            System.out.println(a[i]);
        }
        return a;
    }

    public static String reverseString(String s){
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));

        }
        return s;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,6,5,9,7};
        System.out.println("reverse array");
        reverseArray(arr);
        System.out.println("***************");
        String c="chandrika";
        System.out.println("reverse String");
        reverseString(c);
        System.out.println("*****************");
LinkedList<Integer> integers=new LinkedList<>();
integers.add(1);
integers.add(2);
integers.add(3);

for(int i=integers.size()-1; i>=0; i--){
    System.out.println(integers.get(i));
}
    }
}
