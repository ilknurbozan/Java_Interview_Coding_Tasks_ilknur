package umbriel;

import java.util.ArrayList;
import java.util.Arrays;

public class abba {

    public static String makeAbba(String str1, String str2){

        ArrayList<String>list=new ArrayList<>(Arrays.asList(str1,str2)); //put the elements in arraylist
        list.add(str2); //add the last element as 3rd element
        list.add(str1);//add the first element as 4th element

        String result="";
        for (String each:list) { //reach the all elements and assign them to result as string
            result+=each;
        }

        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        makeAbba("Yo", "Alice");
    }
}


/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
         */
