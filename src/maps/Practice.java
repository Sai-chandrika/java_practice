package maps;

import java.util.*;


public class Practice {

    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("chandrika", "8019271662");
        map.put("akka", "9493138373");
        map.put("amma", "7893146349");
        map.put("mama", "9640201662");
        map.put("mama", "7813818295");
        map.put("nanna", "9951059949");
        map.put("anna", "7075001376");

        for(Map.Entry<String, String> value:map.entrySet()){
            System.out.println(value.getKey() + " :" + value.getValue());
        }

        Set<String> key=map.keySet();
        Collection<String> values=map.values();
        Set<Map.Entry<String, String>> entries=map.entrySet();

        System.out.println(key);
        System.out.println(values);
        System.out.println(entries);
        TreeMap<String, String> tree=new TreeMap<>(map);
        System.out.println(tree);


    }
}
