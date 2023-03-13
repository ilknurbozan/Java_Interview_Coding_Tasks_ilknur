package umbriel.lambdaEx;


import umbriel.lambdaEx.lambdaExample;

public class test{
    public static void main(String[] args) {

       lambdaExample s=new lambdaExample() {
           @Override
           public void method(int num) {
               System.out.println("The cube is: "+num*num*num);
           }
       };
       s.method(4);

    }


}
