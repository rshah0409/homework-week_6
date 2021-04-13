public class Instance_Static2 {
    /*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.

   */
    //4.1
    //declaring static and instance variables.
     int x = 15; //instance variable
     String name = "India"; //instance variable
     static char y = 'N';  //static variable
     static boolean z = true;//static variable

    //4.2
    //declaring instance method
    void r4(){
      System.out.println(x);//4.4-calling instance variables into instance method
      System.out.println(name);//4.4-calling instance variables into instance method
      System.out.println(Instance_Static2.y);//4.4-calling static variable into instance method via class
      System.out.println(Instance_Static2.z);//4.4-calling static variable into instance method via class

    }

    //4.3
    //declaring static method
    static void r2(){
        System.out.println(y); //4.4-calling static variable into static method
        System.out.println(z);//4.4-calling static variable into static method
        Instance_Static2 rm = new Instance_Static2();
        System.out.println(rm.x);//4.4-calling instance variables into static method via object
        System.out.println(rm.name);//4.4-calling instance variables into static method via object
        rm.r4();

    }
    // 4.5
    //declaring main method

    public static void main(String[] args){
        Instance_Static2 rs = new Instance_Static2();//object created for instance variable
        rs.r4();// 4.6-calling instance method into main method
        r2(); //4.6-calling static method into main method

    }













}
