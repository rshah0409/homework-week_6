import java.util.Scanner;


public class MultiplicationTable10 {

    public static void main(String[] args) {

        //Write a Java program that takes a number as input and prints its  multiplication table up to 10.

        Scanner sc = new Scanner( System.in ); //object created for scanner class.
        System.out.print( "Input a number: " );//print statement
        int num1 = sc.nextInt();//next method

        for (int i = 0; i < 10; i++) {
            System.out.println( num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)) );


        }


    }
}