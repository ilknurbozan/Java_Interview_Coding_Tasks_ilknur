package array_tasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */


    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        maxValue(arr);
    }


}
