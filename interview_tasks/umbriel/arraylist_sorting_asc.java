package umbriel;

import java.util.*;

import static javax.swing.UIManager.get;

public class arraylist_sorting_asc {

    public static void asc1(ArrayList<Character>list) {

        ArrayList<Character> ascList = new ArrayList<>();


           char temp=' ';

           for(int i=0; i<list.size(); i++) {
               for(int j=i+1; j<list.size(); j++){

                   if(list.get(j)<list.get(i)){
                       temp=list.get(i);
                       list.set(i,list.get(j));
                       list.set(j,temp);
                   }

               }

               }
               System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Character>list=new ArrayList<>(Arrays.asList('z','c','a','k'));
        asc1(list);



    }


}
/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.

 */