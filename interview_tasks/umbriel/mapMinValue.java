package umbriel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapMinValue {

    public static  int minValue( Map<String, Integer>map){

       // map=new LinkedHashMap<>(); //bu sekilde kullanirsam map i sifirliyor bos gosteriyor, new linkedinhashmap oldugu icin
        System.out.println(map);
        ArrayList<Integer>list=new ArrayList<>();


        for (Map.Entry<String, Integer> each:map.entrySet()) {  //iterate map to reach each pair of map

            list.add(each.getValue());    //adding each value ofmap into an arraylist.
                                        // Arraylist is used because for min num Collections.min() will be used
        }

         int min=Collections.min(list); //finding the min number


     System.out.println("min: "+min);
        return min;
    }

    public static void main(String[] args) {
        Map<String, Integer>map=new LinkedHashMap<>();
        map.put("hailey",32);
        map.put("josh",11);
        map.put("may",3);
        map.put("ilknur",30);

        minValue(map);
    }
}


/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method).
 */