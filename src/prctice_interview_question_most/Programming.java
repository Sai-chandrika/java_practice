package prctice_interview_question_most;

import java.util.*;
import java.util.stream.Stream;

public class Programming {

    public static int findSmallestSecondNUmberInArray( int [] array, int num){
        for(int i=0; i<array.length-1;i++){
            for(int j=0; j<array.length-i-1;j++){
                if (array[j] > array[j+1]) {
                 int temp=array[j];
                 array[j]=array[j+1];
                 array[j+1]=temp;
                }
            }

        }

//        for(int k=0; k<array.length; k++){
//            System.out.println(array[k]);
//        }

        return array[num-1];

    }


    public static int[] commonElements(int[] a, int[] b){
        List<Integer> integerList=new ArrayList<>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    if(!integerList.contains(a[i])){
                        integerList.add(a[i]);
                    }
                }
            }
        }

        int[] common=new int[integerList.size()];
        for(int k=0; k<integerList.size(); k++){
            common[k] =integerList.get(k);
        }

        return common;

    }

    public static int[] reverseArray(int[] a){
        for(int i=a.length-1;i>=0; i--){
            System.out.println(a[i]);
        }
        return a;
    }


    public static int[] removeDuplicates(int[] a){
        List<Integer> removeDuplicates=new ArrayList<>();
        for(int i=0; i<a.length; i++){
           if(!removeDuplicates.contains(a[i])){
               removeDuplicates.add(a[i]);
           }

        }
        int[] remove=new int[removeDuplicates.size()];
        for(int k=0; k<removeDuplicates.size(); k++){
           remove[k]=removeDuplicates.get(k);
        }
        return  remove;
    }

    public static int[] removeCompleteDoubleElements(int[] a){
        List<Integer> removeDuplicates=new ArrayList<>();
        List<Integer> common=new ArrayList<>();
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]==a[j]){
                    if(!common.contains(a[i])) {
                        common.add(a[i]);
                    }
                }
            }
//{1,5,2,4,1,4}

        }
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]!=a[j]){
                    if(!removeDuplicates.contains(a[i])) {
                        removeDuplicates.add(a[i]);
                    }
                }
            }
//{1,5,2,4,1,4}

        }
        removeDuplicates.removeAll(common);
        int[] remove=new int[removeDuplicates.size()];
        for(int k=0; k<removeDuplicates.size(); k++){
            remove[k]=removeDuplicates.get(k);
        }
        return  remove;
    }

    public static String removeDuplicatesInString(String s){
        List<String> strings=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
           if(!strings.contains(String.valueOf(s.charAt(i)))){
               strings.add(String.valueOf(s.charAt(i)));
           }
        }
//        for(int k=0; k<strings.size(); k++){
//            System.out.println(strings.get(k));
//        }

        StringBuffer stringBuffer=new StringBuffer();
        for(String s1: strings){
            stringBuffer.append(s1);
        }
       return stringBuffer.toString();

    }

    public static void  removeDuplicateCountInString(String name){
      Map<String , Integer> nameCount=new HashMap<>();
        char[] chars=name.toCharArray();
        for(int i=0; i<chars.length; i++){
            nameCount.put(String.valueOf(chars[i]), nameCount.getOrDefault(String.valueOf(chars[i]),0)+1);
        }
        for(Map.Entry<String , Integer> entry:nameCount.entrySet()){
            System.out.println(entry.getKey() + "count is :  " + entry.getValue()) ;
        }

    }


    public static void duplicateCount(int[] a){
        Map<Integer, Integer> integerIntegerMap=new HashMap<>();
        for(int i=0; i<a.length; i++){
            integerIntegerMap.put(a[i], integerIntegerMap.getOrDefault(a[i],0) +1);
        }

        for(Map.Entry<Integer, Integer> entry:integerIntegerMap.entrySet()){
            System.out.println(entry.getKey() + " count is : " + entry.getValue());
        }

    }

    public static  void palindromeCheck(String s){
        String s1=new String();
        String s2=new String();
        for(int i=0; i<s.length(); i++){

            s1= String.valueOf(s.charAt(i));
        }



        for(int i=s.length()-1; i>=0; i--){
            s2= String.valueOf(s.charAt(i));

        }


        if(s1.equals(s2)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not  palindrome");

        }
    }
    public static void main(String[] args) {
        int[] array={1,4,6,5,9,7};
        int[] array1={6,9,12,22,16};
//        int num=3;
//        OptionalInt d= Arrays.stream(array).sorted().skip(num-1).findFirst();
//        System.out.println(d);
        int a= findSmallestSecondNUmberInArray(array,2);
        System.out.println(a);
        System.out.println("find common elements");
        int[] common=commonElements(array,array1);
        for(int k=0; k<common.length; k++) {
            System.out.println(common[k]);
        }
        int[] array3={1,4,6,5,9,7};
        System.out.println("reverse");
        reverseArray(array3);

        System.out.println("remove duplicates");
        int[] remove={1,4,5,8,1,4,2};
        int[] fix=removeDuplicates(remove);
        for(int k=0; k<fix.length; k++){
            System.out.println(fix[k]);
        }

        System.out.println("values count");
        int[] remove1={1,4,5,8,1,4,2};
        duplicateCount(remove1);
        System.out.println("count duplicate in String ");
String name="chandrika";
        removeDuplicateCountInString(name);
        System.out.println("remove duplicate in String ");

        String s=  removeDuplicatesInString(name);
        System.out.println(s);
        System.out.println("palindrome");
        String palindrome="mouni";
        palindromeCheck(palindrome);
        System.out.println("remove completely duplicate elements");
        int[] duplicate={1,5,2,4,1,4};
       int[] completelyRemove= removeCompleteDoubleElements(duplicate);
       for(int k=0; k<completelyRemove.length;k++){
           System.out.println(completelyRemove[k]);
       }
    }
}
