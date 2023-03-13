package umbriel;



public class sumOfDigitsInString {

    public static int returnString(String str){

        int sum=0;

        for(Character each:str.toCharArray()) {  //to reach every item of the string I use toCharArray method, so it convert it to Array
                                                // I use Character because I need to use isDigit method.

            int num=0;  //we need to initialize num element in for loop because we need to assign it to 0 in every loop term

            if(Character.isDigit(each)){        //  to pick the digit elements
           num= Character.getNumericValue(each);  //converting the every Character elements to a non-primitive(int) type and assign them an int variable which is num

            sum+=num; //add each element to sum and calculate

        }}

        System.out.println(sum);
        return sum;

    }


    public static void main(String[] args) {

        returnString("xys6ddd7d1");
    }
}


/*
String -- sum of digits in a string Write a method that can return the sum of the digits in a string
 */