public class Instance_Static1 {

    /* 3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
   */
    //3.1
    //declaring instance and static variables
    int a = 30;
    static char ch = 'R';
    //3.2
    //instance method
    void c (){
        System.out.println(a); //3.4-calling instance variable into instance method
        System.out.println(ch);//3.4-calling static variable in to instance method
    }
    //3.3
    //static method
    static void d(){
    System.out.println(ch);//3.4-calling static variable into static method
        Instance_Static1 n = new Instance_Static1();//creating object
        System.out.println(n.a);//3.4-calling instance variable into static method


    }

    //3.5
    //main method
    public static void main(String[] args ){

        Instance_Static1 rs = new Instance_Static1();//object created
        rs.c(); //3.6-calling instance method into main method
        d(); //3.6-calling static method into main method


    }



}
