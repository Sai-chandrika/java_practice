package concepts;

import java.util.*;

public class CollectionFrameWork {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        Map<Integer, String> map=new HashMap<>();
       map.put(1,"chandrika");
       map.put(2,"mounika");
       map.put(3,"hari");
       map.put(4,"poorna");

        System.out.println("step -1");
       for(Map.Entry<Integer,String> mapEntry:map.entrySet()){
           System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
       }

        System.out.println("step -2");
       Iterator<Map.Entry<Integer,String>> iterator1=map.entrySet().iterator();
       while(iterator1.hasNext()){
           Map.Entry<Integer,String> mapIterator=iterator1.next();
           System.out.println(mapIterator.getKey() + " : " + mapIterator.getValue());
       }
        System.out.println(" step- 3");
        map.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
