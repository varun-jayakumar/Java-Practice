package OPP;

public class ObjectClassDemo{
    public static void main(String [] args) {
/* creating normal String not explicitly creating new objects 
       String pooling is possible here*/  
    String s1="Java";
    String s2= "Java";

/*creating new String by explicitly creating new objects in Java
 * String pooling is not possible here
 */
    String s3= new String("Java");
    String s4= new String("Java");

//--------------------------------WE WILL TEST THIS NOW-----------------------------------

//this just refers to the memory location (NOT THE STRING)

System.out.println(s1==s2);  //since string pooling was possible here it refers to the same memory location (true)

System.out.println(s3==s4);  // here since we created new objects explicitly this will be (false)

// To compare the content

System.out.println(s3.equals(s4));

/*
 * Now how are we able to use the equals method
 * the object class has an method equals() with a definition to compare the refereance (memory location)
 * The String class has overwritten the method equals of object class
 * and has the code to compare two strings
 * 
 * similarly if we want to compare two objects 
 * 
 */


 //how to write STANDARD isEquals for comparing objects

Employee E1=new Employee("John",5000);
Employee E2=new Employee("John",5000);

System.out.println("E1 quals to E2? " + E1.equals(E2)); //compares memory location by default so, we have to define 
                                                        //it in employee class
    }




}