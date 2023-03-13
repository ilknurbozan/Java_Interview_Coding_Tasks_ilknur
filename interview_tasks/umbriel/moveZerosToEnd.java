package umbriel;

import java.util.Arrays;

public class moveZerosToEnd {

    public static int[] MoveZeros(int[] array) {

        int[]newArray=new int[array.length];


       for(int i=0, j=0; i<array.length; i++){ //i is for iterate int[] array, j is for iterate int[] new array

           if(array[i]>0){
               newArray[j]=array[i];
               j++; //it is important to increase the j value in here it is only increased when array[i] bigger than 0.
           }


       }
        System.out.println(Arrays.toString(newArray));
       return newArray;
    }


    public static void main(String[] args) {
        int[]arr={1,0,2,0,4,0,6,0};
        MoveZeros(arr);
    }

    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */
}
