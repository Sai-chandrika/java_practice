package prctice_interview_question_most;


import java.util.ArrayList;
import java.util.List;

public class Sorting_Swapping_Count {

    public static int[] numbersSorting(int[] a) {
        int swap = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap++;
                }
            }
        }
        for (int k = 0; k <a.length; k++) {
            System.out.println(a[k]);
        }

        System.out.println("swap count" + swap);

        return a;
    }

    public static String[] sortStringArray(String[] string){
        int swap=0;
       for(int i=0; i<string.length;i++){
           for( int j=i+1; j<string.length; j++){
               if(string[i].compareTo(string[j]) > 0){
                      String temp=string[i];
                      string[i]=string[j];
                      string[j]=temp;
                      swap++;
               }
           }
       }
       for(int k=0; k<string.length; k++){
           System.out.println(string[k]);
       }
        System.out.println(" swap count string array sort" + swap);
       return string;
    }

    public static List<String> sortStringList(List<String> list){
        int swap=0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) >0){
                    String temp=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                    swap++;

                }
            }
        }
        for(int k=0; k<list.size(); k++){
            System.out.println(list.get(k));
        }
        System.out.println("swap count sort String list : "  + swap);

        return list;
    }


    public static char[] sortTheString(String  str){
        char[] charArray = str.toCharArray();
        int swap=0;
        for(int i=0 ;i<charArray.length-1; i++){
            for(int j=0;j<charArray.length-i-1;j++ ){
                if(charArray[j]>charArray[j+1]){
                    char c=charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=c;
                    swap++;
                }
            }
        }
        for(int k=0; k<charArray.length;k++){
            System.out.println(
                    charArray[k]);
        }
        System.out.println("swap count at String sort");
        return charArray;

    }



    public static List<Integer> numbersSortingList(List<Integer> list){
int swap=0;
        for(int i=0;i<list.size()-1;i++){
            for(int j=0; j<list.size()-i-1; j++){
                if(list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
swap++;

                }
            }
        }
        for(int k=0; k<list.size();k++){
            System.out.println(list.get(k));
        }
        System.out.println("swap list sort count:" +swap);
return list;
    }


    public static void main(String[] args) {



        System.out.println("sort the int array ");
        int[] i={1,65,34,81,78};
        numbersSorting(i);
        System.out.println("**********************");
        System.out.println("sort the int List ");
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(65);
        integers.add(34);
        integers.add(81);
        integers.add(78);
        numbersSortingList(integers);
        System.out.println("*****************************");
        System.out.println(" sort the String array");
        String[] array={"r", "s", "s", "v", "m", "c", "h", "p"};
        sortStringArray(array);
        System.out.println("****************************");
        System.out.println(" sort the String List");

        List<String> strings=new ArrayList<>();
        strings.add("ramakrishna");
        strings.add("swathi");
        strings.add("suresh");
        strings.add("vani");
        strings.add("mouni");
        strings.add("chandu");
        strings.add("hari");
        strings.add("poorna");
        sortStringList(strings);
        System.out.println("*************************************");

        System.out.println("sort the String");
        String name="chandrika";
        sortTheString(name);
        System.out.println("*************************************");


    }
}
