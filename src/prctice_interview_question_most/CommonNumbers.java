package prctice_interview_question_most;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonNumbers {

    public static List<Integer> commonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    if (!common.contains(list1.get(i))) {
                        common.add(list1.get(i));
                    }
                }
            }
        }
        return common;
    }


    public static int[] commonInArray(int[] array1, int[] array2){
         List<Integer> commonList=new ArrayList<>();
         for(int i=0; i<array1.length; i++){
             for(int j=0; j<array2.length; j++){
                 if(array1[i]==array2[j]){
                     if(!commonList.contains(array1[i])){
                         commonList.add(array1[i]);
                     }
                 }
             }
         }

         int[] commonArray=new int[commonList.size()];
        for(int k=0; k< commonList.size(); k++){
            commonArray[k]=commonList.get(k);
        }

        return commonArray;

    }

    public static int[] differentArray(int[] array1, int[] array2){
        List<Integer> differentList=new ArrayList<>();
        for(int i:array1){
            if(!contains(array2,i)&& !differentList.contains(i) ){
                differentList.add(i);
            }
        }

        for(int i:array2){

            if(!contains(array1,i)&& !differentList.contains(i) ){
                differentList.add(i);
            }
        }

        int[] different=new int[differentList.size()];
        for(int j=0; j< differentList.size();j++){
            different[j]=differentList.get(j);
        }

        return different;
    }

    public static String[] commonValuesInStringArray(String[] s1, String[] s2){
        List<String> strings=new ArrayList<>();
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    if(!strings.contains(s1[i])){
                        strings.add(s1[i]);
                    }
                }
            }
        }
        String[] s=new String[strings.size()];
        for(int k=0; k<strings.size();k++){
            s[k]=strings.get(k);
        }
        return s;
    }

    public static boolean contains(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    public static List<String> stringArrayCommon(List<String> string1,List<String> string2 ){
        List<String> commonString=new ArrayList<>();
        for(int i=0; i<string1.size();i++){
            for(int j=0; j<string2.size();j++){
               if(string1.get(i).equals(string2.get(j))){
                    if(!commonString.contains(string1.get(i))){
                         commonString.add(string1.get(i));
                    }
                }
            }
        }
        return  commonString;
    }

    public static  List<Integer> differentValues(List<Integer> list1, List<Integer> list2){
        List<Integer> different=new ArrayList<>();
        for(Integer i:list1){
            if(!different.contains(i)&& !list2.contains(i)){
                different.add(i);
            }
        }
        for(Integer i:list2){
            if(!different.contains(i)&& !list1.contains(i)){
                different.add(i);
            }
        }
        return different;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(80);
        list1.add(19);
        list1.add(27);
        list1.add(16);
        list1.add(62);

        List<Integer> list2 = new ArrayList<>();
        list2.add(99);
        list2.add(16);
        list2.add(89);
        list2.add(16);
        list2.add(62);

        System.out.println("Common Numbers: in list");
        List<Integer> common = commonElements(list1, list2);
        for (int i = 0; i < common.size(); i++) {
            System.out.println(common.get(i));
        }
        System.out.println("different Numbers: in list");

        List<Integer> different = differentValues(list1, list2);
        for (int i = 0; i < different.size(); i++) {
            System.out.println(different.get(i));
        }

        System.out.println("Common Numbers: in array");
        int[] array1={80,19,27,16,62};
        int[] array2={99,16,89,16,62};
        int[] commonArray=commonInArray(array1,array2);
        for(int i=0; i<commonArray.length; i++) {
            System.out.println(commonArray[i]);
        }
        System.out.println("different Numbers: in array");
        int[] differentArray=differentArray(array1,array2);
        for(int i=0; i<differentArray.length; i++) {
            System.out.println(differentArray[i]);
        }
        System.out.println("common Numbers: in list String");
        List<String> stringArray1 = Arrays.asList("apple", "banana", "orange", "kiwi");
        List<String> stringArray2 = Arrays.asList("orange", "kiwi", "grape", "banana");
        List<String> commonString=stringArrayCommon(stringArray1,stringArray2);
        for(int i=0; i<commonString.size();i++){
            System.out.println(commonString.get(i));
        }
        System.out.println("common Numbers: in Array String");
        String[] s1={"c", "h", "a", "n", "d", "u"};
        String[] s2={"m", "o", "u", "n", "i"};

       String[] print= commonValuesInStringArray(s1,s2);
      for(int k=0; k<print.length; k++){
          System.out.println(print[k]);
      }
    }

}
