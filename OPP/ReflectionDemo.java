package OPP;
import java.lang.reflect.*;

public class ReflectionDemo {
    
    public static void main(String[] args)
    {
        Employee e=new Employee("Diya",6000);

        /* 
        assume you have an object e in the program but you have no idea 
        about which class the object belongs to or what attributes or 
        methods it has. thats when you use reflection
         */
        
        
        Class cls=e.getClass();
        System.out.println("Class Name is:"+ cls.getName());
        Method[] methods=  cls.getMethods();

        for(Method M: methods){
            System.out.println(M.getName());
        }

       
            try {
                System.out.println(methods[1].invoke(e,null));
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
       

    }
}
