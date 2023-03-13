package umbriel;

import java.util.ArrayList;
import java.util.Arrays;

public class concatTwoArrays {


public static String[] concatArray1(String[] arr1, String[] arr2){

    String[] concat=new String[arr1.length+arr2.length];

    for(int i=0; i<arr1.length; i++){
        concat[i]=arr1[i];
    }
    for(int i=arr1.length, j=0; i< concat.length; i++, j++){
        concat[i]=arr2[j];
    }

    System.out.println(Arrays.toString(concat));
    return concat;

}



    public static void main(String[] args) {
        String[] arr1= {"nw"};
        String[] arr2= {"a, l, m"};
        ;
        concatArray1(arr1,arr2);

    }
    /*
    1) Array - Concat two arrays
    Write a return method that can concate two arrays
     */


}
