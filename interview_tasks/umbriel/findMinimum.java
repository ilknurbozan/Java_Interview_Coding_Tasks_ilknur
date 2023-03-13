package umbriel;

public class findMinimum {

    public static int findMin(int[] arr){
        int min=arr[0];
        for(int each:arr){
            if(each<min){
                min=each;
            }
                   }
        System.out.println(min);
return min;
    }

    public static void main(String[] args) {
        int[] arr1={3,1,8};
        findMin( arr1);
    }

    /*
    Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
     */
}
