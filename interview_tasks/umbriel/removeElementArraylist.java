package umbriel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeElementArraylist {

    public static void removeMethod(ArrayList<String>arr){

        arr.removeAll(Collections.singleton("Ahmed"));
        System.out.println(arr);

    }

    public static void removeIfMethod(ArrayList<String>arr2){

        arr2.removeIf(p->p.equals("Ahmed"));
        System.out.println(arr2);

    }

    public static void removeWithoutReadyMethod(ArrayList<String>arr3, String element){
        ArrayList<String>arr4=new ArrayList<>(); //list without Ahmed
        element="Ahmed";

        for (String each:arr3) {
            if(each.equalsIgnoreCase(element)){
                continue;
            }
            else{
                arr4.add(each);
            }
        }
        System.out.println(arr4);

    }


    public static void main(String[] args) {
        ArrayList<String>arr1=new ArrayList<>(Arrays.asList("Ahmed", "John","Selim", "Eric", "Ahmed", "Ahmed"));
        removeMethod(arr1);
        removeIfMethod(arr1);
        removeWithoutReadyMethod(arr1,"ahmed");
    }

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
     */

}
