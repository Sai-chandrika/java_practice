package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSet {

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> map=new HashMap<>();

        for(int value:ar){
            map.put(value, map.getOrDefault(value,0)+1);
        }
        int individual=0;
        for(int values:map.values()){
            if(values ==1 || values%2!=0 ){
                individual++;
            }
        }
        return individual;

    }

    public static int sockMerchant1(int n, List<Integer> ar) {

        Map<Integer, Integer> map=new HashMap<>();

        for(int value:ar){
            map.put(value, map.getOrDefault(value,0)+1);
        }
        int pair=0;
        for(int values:map.values()){
            pair+=values/2;
        }
        return pair;

    }

public static void main(String[] args) {
        List<Integer> ar=new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(10);
   int individual= sockMerchant(9, ar);
   int pairs= sockMerchant1(9, ar);
    System.out.println(individual);
    System.out.println(pairs);
}



}
