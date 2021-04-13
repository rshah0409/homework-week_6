import java.util.Scanner;//scanner class imported
//Write a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).
public class Circle_Radius6 {

         //main method
    public static void main(String[] args) {
        double a1, r1; //data type defined
        Scanner input = new Scanner(System.in); //object created for scanner class
        System.out.println("Enter the radius of circle ="); //prnt statement
        r1 = input.nextDouble(); //method of scanner class
       //
        // input.close();
        a1 = Math.PI * r1 * r1; // formula given
        System.out.println("Area of the circle is =" + a1);//prnt statement


    }
}