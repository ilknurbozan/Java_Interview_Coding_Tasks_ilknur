package umbriel;

import java.util.Arrays;

public class sortAscending {

    public static int[] sortAscending(int[] arr){


        int[] sorted=new int[arr.length];


for(int i=0; i<arr.length; i++){
    int min=arr[0];
    for(int each:arr){

        if(each<min){

            min=each;
        }
    }
    sorted[i]=min;

}





        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(arr));
return sorted;

    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortAscending(arr);
    }
}


/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */