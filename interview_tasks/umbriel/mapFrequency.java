package umbriel;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class mapFrequency {


    public static void frequency(String str){

        Map<String, Integer>map=new LinkedHashMap<>();
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        for(String each: list){
            int frequency=Collections.frequency(list,each);
            map.put(each,frequency);
        }
        System.out.println(map); }

    public static void main(String[] args) {
        frequency("ffff455pop");
    }


}


/*
Map-- Frequency of Characters
Write a method that prints the frequency of each character from a String.

 */