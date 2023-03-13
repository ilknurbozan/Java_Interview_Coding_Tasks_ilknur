package umbriel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeElementArraylist {

    public static void remove(ArrayList<String>arr){

        arr.removeAll(Collections.singleton("Ahmed"));
        System.out.println(arr);

    }

    public static void removeIf(ArrayList<String>arr2){

        arr2.removeIf(p->p.equals("Ahmed"));
        System.out.println(arr2);

    }

    public static void main(String[] args) {
        ArrayList<String>arr1=new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        remove(arr1);
        removeIf(arr1);
    }

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
     */

}
