public class Instance_Main1 {

     /*1. Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print statement.
            1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and Run the programme.

     */

      //1.1

      int a = 10; //instance variable
      float b = 20.25F; //instance variable
     //1.2
    //instance method

    void c (){
       //1.3
    //instance area
    System.out.println(a);
    System.out.println(b);
    }
   //1.4
    //main method

   public static void main(String[] args) {


       //1.5
       Instance_Main1 rs = new Instance_Main1();//object created
       System.out.println(rs.a); //calling instance variables
       System.out.println(rs.b); //calling instance variables
       rs.c(); //calling instance method into main method

   }




}
