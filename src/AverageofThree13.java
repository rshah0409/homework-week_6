import java.util.Scanner;//importing util package for scanner class
//Write a Java program that takes three numbers as input to calculate and  print the average of the numbers


public class AverageofThree13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);//object created
        double a,b,c,f; //defining variables
        System.out.println("INPUT 3 NUMBERS:");
         a = sc.nextDouble();//next functionality
         b = sc.nextDouble();//next functionality
         c = sc.nextDouble();//next functionality
         f = (a + b + c)/(3); //average of 3 numbers.
         System.out.println("AVERAGE OF 3 NUMBERS :"+ f);

    }








}
