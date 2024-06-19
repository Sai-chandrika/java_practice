package array;

import java.util.ArrayList;
import java.util.List;

public class Rotation {

    public  static List<Integer> rotation(List<Integer> a, int r){
        int size=a.size();
        r=r%size;
        List<Integer> integers=new ArrayList<>(a.subList(r,size));
        integers.addAll(a.subList(0, r));
        return integers;
    }

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        int rotation=3;
        List<Integer> rorateList=rotation(a,rotation);
        System.out.println(rorateList);
    }
}
