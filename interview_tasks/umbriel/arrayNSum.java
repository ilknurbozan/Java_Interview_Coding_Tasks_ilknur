package umbriel;

import java.util.Arrays;
import java.util.Random;


public class arrayNSum {

    public static int[] arrayNSum(int n){
    int[] arr=new int[n];
    int sum=0;
        if(n%2==0) {
    for (int i = 0, j = -(n / 2 - 1); i < n; i++, j++) {
        if(j==0){ sum += arr[i];

                continue;
            }arr[i] = j;}



    }


        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
return arr;

    }

    public static void main(String[] args) {
        arrayNSum(4);
    }


    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).

     */
}
