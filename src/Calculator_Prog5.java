import java.util.Scanner; //util package imported for scanner class



public class Calculator_Prog5 {



    /*Write a program for a calculator with addition, subtraction, multiplication
     and division methods all with parameters and use string concatenation  methods.
    (Note: Two static and Two instance methods.)
     */

        int a = 10;
        String b = "Unicorn";
        static int c = 5;
        static String d = "horn";

        //instance method
      void f(){
              System.out.println(a);
              System.out.println(b);

      }
      static void u(){
          System.out.println(c);
          System.out.println(d);

      }
        //main method
    public static void main(String[] args){

          Calculator_Prog5 q = new Calculator_Prog5();
          q.f();//calling instance method into main method
          u();//calling static method into main method




          Scanner r = new Scanner(System.in); //object created for scanner class

       int r1,r2,add,subtract,multiply;// data type defined
       float divide;                  //datatype defined
       System.out.println("Enter two numbers:");//prnt statement for new values for calculator
       r1 = r.nextInt(); //method of scanner class
       r2 = r.nextInt();//method of scanner class

       add =      r1 + r2; //functionality of variable
       subtract = r1 - r2; //functionality of variable
       multiply = r1 * r2; //functionality of variable
       divide =  (float) r1/r2; //functionality of variable

       System.out.println("sum="+add);
       System.out.println("difference="+subtract);
       System.out.println("multiplication="+multiply);
       System.out.println("division="+divide);








    }









}
