package java_interview_practice;

public class Sorting {
    public static void main(String[] args) {


        String letters[]={"a","b","f","c","t","g"};
        int num=letters.length;
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                if(letters[i].compareTo(letters[j]) >0){
                    String temp=letters[i];
                    letters[i]=letters[j];
                    letters[j]=temp;
                }
            }


        }

        for(String let:letters){
            System.out.print(let + " " );
        }
        System.out.println();


        int arr[] = {1, 2, 3, 10, 4, 8};
        int swap=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }
        System.out.println( "swap cpount : " + swap);

        for (int k :arr) {
            System.out.println(k);
        }
    }





    }



