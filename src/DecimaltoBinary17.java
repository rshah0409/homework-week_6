import java.util.Scanner;

public class DecimaltoBinary17 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//object in scanner created
        System.out.println("Enter a decimal number");//print statement
        int n=sc.nextInt(); // defined next function(token)
        int  bin[]=new int[100]; //arays syntax
        int i = 0;
        while(n > 0)      //loop syntax
        {
            bin[i++] = n%2;
            n = n/2;
        }
        System.out.print("Binary number is : ");
        for(int j = i-1;j >= 0;j--)   //loop syntax
        {
            System.out.print(bin[j]); //print statement
        }








    }





}
