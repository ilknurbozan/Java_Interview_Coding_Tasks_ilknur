
package umbriel;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class frequencyOfChar {


    public static String charFrequency(String str) {

        String result = ""; //arraylist icindeki elementlerin frequency degerini ve elementleri yazdirmak icin //to get the frequency and elements of the arraylist
        String nonDup = ""; //tekrarlamayan sekilde yazdirmak icin //for non duplicated version
        int frequency = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); //verilen stringi aslist methodu ve split ile arraylist icine yazdirdik

        for (String each : list) {    //arraylistin her bir elemaninin frequency degerini bulmak icin for each kullandik

            frequency = Collections.frequency(list, each);

            result += each + frequency + ",";

        }

        //burada resulta assign ettik her bir elementi ve frequency degerini
        // ancak buradaki kodu calistirirsak uniqe yazdirmaz. A3,A3,A3B2B2C4C4C4C4 seklinde yazdiriyor. A3B2C seklinde yazmasi lazim


        for (String each : result.split(",")) {   //burada result degerini "," split ettik ve her bir degeri uniqe olarak yazdirdik

            if (!(nonDup.contains(each))) {
                nonDup += each;
            }
        }


        System.out.println(nonDup);

        return nonDup;
    }

    public static String solution2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            String nonDup = "";
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) != str.charAt(j)) {
                    nonDup= ""+str.charAt(i);

                }
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            result += nonDup + count + ",";

        }

        System.out.println(result);


return result;
    }

    public static void main(String[] args) {
        //charFrequency("AAABBCDDDFFFFF");
        solution2("AABBBCDDDDDD");
    }
}


/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */