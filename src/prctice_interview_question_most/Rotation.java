package prctice_interview_question_most;

import java.util.ArrayList;
import java.util.List;

public class Rotation {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        int size=integerList.size();
        int rotate=2;
        rotate=rotate%size;
        List<Integer> rotation=new ArrayList<>(integerList.subList(rotate,size));
        rotation.addAll(integerList.subList(0,rotate));
        for(int i=0; i<rotation.size();i++){
            System.out.println(rotation.get(i));
        }

        int arr[]={1,2,3,4,5};
        int arrSize=arr.length;
        int rotationSize=2;
        rotationSize=rotationSize%arrSize;
        int arr1[]=new int[arrSize];
        System.arraycopy(arr,arrSize-rotationSize,arr1,0,rotationSize);
        System.arraycopy(arr, 0,arr1,rotationSize,arrSize-rotationSize);
        System.arraycopy(arr1,0,arr,0,arrSize);
        for(int i=0; i<arrSize;i++){
            System.out.println(arr[i]);
        }
    }
}
