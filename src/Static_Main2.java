public class Static_Main2 {

    /* 2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
   */
          //2.1
         //static variables.
   static long l = 234567;
   static String a = "Testing";
        //2.2
       //static method

    static void z (){
        //2.3
        //static area
        System.out.println(l);
        System.out.println(a);
    }
         //2.4
        //main method
    public static void main(String[] args){
        //2.5
        //static area

        System.out.println(l);//calling static variable into main method
        System.out.println(a);//calling static variable into main method
        z();//calling static method





    }













}
