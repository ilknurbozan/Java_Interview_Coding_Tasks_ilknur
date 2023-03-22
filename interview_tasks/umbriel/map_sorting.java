package umbriel;

import java.util.*;

public class map_sorting {

    public static Map<String, Integer> sortedMap(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        System.out.println(map);
        return map;

    }
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 12);
        map.put("Antony", 10);
        map.put("Jimmy", 11);
        map.put("Jalil", 14);
        map.put("James", 11);
        map.put("Conor", 85);
        sortedMap(map);

    }
}


/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */