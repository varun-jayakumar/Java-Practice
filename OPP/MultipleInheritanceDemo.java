package OPP;

import javax.swing.event.SwingPropertyChangeSupport;

/*
 * The problem of Multiple Inheritance
 */
class A{
void display(){
    System.out.println("This is from Class A");
    }
}

class B{

    void display(){
    System.out.println("This is from class B");
}
}


//class C extends A, b  //this is not possible with class
/*
 * Why? not possible with classes whats the issue
 * example:
 * we have class A with method display()
 * we have class B with method display()
 * we habe class C which extends class A and class B.
 * now, we call display with an object of class C then which display should be called? confusion
 * lly, when we overwrite display() fuction which display() od class A or B should be overwritten
 */

class C extends B{
    public static void main(String[] args)
    {
            C c=new C();
            c.display();  // display() called from class B or will call from nearest super class
    }
}



