import java.util.Scanner;
/* Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C). */

public class Fahrenheit_Celsius7 {



    public static void main(String[] args){

        Scanner z = new Scanner(System.in);//object created for scanner class
         double f,c; //data type defined
        System.out.println("Enter Temperature in fahrenheit: ");//print statement
         f = z.nextDouble();//method of scanner class
        c = (f - 32)*(5) /(9);
        System.out.println(" Temperature in Celsius:" + c);



        }
    }











