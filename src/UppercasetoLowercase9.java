import java.util.Locale;
import java.util.Scanner;

public class UppercasetoLowercase9 {

    // Write a program to convert the upper case to lower case.

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);//creating object in scanner class
        System.out.println("Enter name in Upper case: ");//printstatment to enter your data
        String name =r.next();//syntex for next string

        String a = name.toLowerCase( Locale.ROOT);//call locale predefine systex for lower cases
        System.out.println(a);// printstatement  to display result


    }





}
