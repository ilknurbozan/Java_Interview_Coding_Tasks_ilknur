package umbriel;

import java.util.Arrays;

public class findMaximum {

    public static int max(int[] arr) { //[5,2,7,-1]

        int max=arr[0];   //initialize the max number to the first index of array

        for(int i=0; i< arr.length; i++){     //reach all the elements of array

            if(arr[i]>max){   //check if the array elements bigger than max value, if it is bigger assign the value to max

                max=arr[i];
            }

        }

        System.out.println("The max num is: "+max);
          return max;
    }

    public static void main(String[] args) {

        int[] arr1={5,2,7,-1};

        System.out.println(Arrays.toString(arr1));
        max(arr1);
    }
}


/*
Array -- Find Maximum Write a method that can find the maximum number from an int Array
 */