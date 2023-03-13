package umbriel;

import java.util.Arrays;

import java.util.TreeSet;

public class sameLetters {

    public static boolean sameLetters(String str1, String str2){

        TreeSet<String> set1=new TreeSet<>(Arrays.asList(str1.split(""))); //putting the string in tree set to list them as uniqe and sorted
        TreeSet<String> set2=new TreeSet<>(Arrays.asList(str2.split(""))); //by this way we can be sure the order of the char and we can compare them

         //System.out.println(set1);
        //System.out.println(set2);

        if(set1.equals(set2)){ //compare the sets by equal method, I dont use containsAll method because it just check  one side not both of the set
            System.out.println("They include same letters");
            return true;
        }
        else {System.out.println("They dont include same letters");

        return false;}


    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cba"));
    }

}


/*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:


 */