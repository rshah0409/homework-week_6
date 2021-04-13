import java.util.Scanner;

public class AreaofTriangle8 {
    //Write a program to calculate the area of a triangle.
   //Area of Triangle = ½(b × h) where b is base and h is height.
public static void main(String[] args) {

        Scanner T = new Scanner(System.in);//object created
        System.out.println("Enter the number to measure area of Triangle");//print statement
        float radius = T.nextFloat();//datatype declared
        float height = T.nextFloat();//datatype declared
        float area = ( radius*height) / 2 ;// formula

        System.out.println("Area of Triangle is: "+area);//print statement
    }



}
