package umbriel;

public class removeDuplicates {

    public static String removeDup(String str){

        String nonDup="";

        for(int i=0; i<str.length(); i++){

            if(!(nonDup.contains(""+str.charAt(i)))){

                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);

  return nonDup;}








    public static void main(String[] args) {

        removeDup("AAABBBCCCDDFFE");
    }
}


/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */