package umbriel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class passwordValidation {


public static boolean passwordValidation(String password){

int upper=0;
int lower=0;
int special=0;
int digit=0;

    char[] arr=password.toCharArray();// create a char array to reach each of the password items

    for(char each:arr){
       if(Character.isUpperCase(each)){
           upper++;

       }
        if(Character.isLowerCase(each)){
            lower++;
        }
        if(!(Character.isLetterOrDigit(each))){
            special++;
        }
       if(Character.isDigit(each)){
            digit++;
        }



    }
    if(password.length()-1<6 ){
        System.err.println("password must include at least 6 characters");
                System.exit(1);//It is a MUST condition so if it is not true exit

    }
    else {      //this part is SHOULD part

        if (upper==0 || lower==0 || special==0|| digit==0 || password.contains(" ")){   //if one of them is true give error message

            System.err.println("try again");
        }
        else{ System.out.println("valid password = " + password);}  //if all conditions are true then print the password


return true;
    }
    return false;
}


    public static void main(String[] args) {
        passwordValidation("Apple_3");
    }

}



/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */