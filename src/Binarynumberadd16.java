import java.util.Scanner;
public class Binarynumberadd16 {
    /*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101 */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//create object for scanner
        System.out.println("Input first binary Number: ");//ask the user to add value
        String a=in.nextLine(); //10

        System.out.println("Input first binary Number: ");//ask the user to add value
        String b=in.nextLine();//11

        Integer no1 = Integer.parseInt(a,2);
        System.out.println("Decimal no1:" + no1);
        Integer no2 = Integer.parseInt(b,2);
        System.out.println ("Decimal no2: "+ no2);

        Integer res = no1 + no2;
        System.out.println ("Decimal result:" + res);
        System.out.println("Sum of two binary numbers: "+ Integer.toBinaryString(res));






    }
}



















