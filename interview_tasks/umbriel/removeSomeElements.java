package umbriel;

import java.util.ArrayList;
import java.util.Arrays;

public class removeSomeElements {

    public static void removeSomeValues(ArrayList<Integer>num){

        num.removeIf(p->p>100);

        System.out.println(num);


    }

    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>(Arrays.asList(1,2,360,100,500,780));
        removeSomeValues(num);
    }

    /*
    3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
}
