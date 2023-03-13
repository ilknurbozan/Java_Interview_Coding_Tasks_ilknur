package umbriel;

import java.util.*;

public class findUnique {

    public static String unique(String str){

        Set<String>s1=new LinkedHashSet<>(Arrays.asList(str.split("")));//LinkedHashSet maintains the insertion order and it removes the duplicated elements

       String result="";

       for(String each:s1){   //iterate the element and print them

           result+=each;
       }

        System.out.println(result);

       return result;

    }

    public static void main(String[] args) {
        unique("XXXZZYYKKZ");
    }
}


/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */