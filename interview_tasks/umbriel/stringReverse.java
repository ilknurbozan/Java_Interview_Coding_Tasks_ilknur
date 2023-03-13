package umbriel;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Stack;

public class stringReverse {

    public static String reverseString(String str){

        String reverse="";

       for(int i=str.length()-1; i>=0; i-- ){
           reverse+=str.charAt(i);

       }
        System.out.println(reverse);
        return str;


    }

    public static void main(String[] args) {
        reverseString("AABCXYD");
    }

}


/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */