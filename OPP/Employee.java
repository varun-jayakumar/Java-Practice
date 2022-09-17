package OPP;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public boolean equals(Object obj)
    {
        if(this==obj)             //checking for reference
        return true;

        if(obj==null)             //checking if the object is null
        return false;

       else if(obj.getClass()!=this.getClass())      // cehcking if its of same class name
       return false;

       Employee e= (Employee) obj;                   // casting obj to Employee to access its fields
       return this.name.equals(e.name)&&this.salary==e.salary;  //if we dint check for null and same class name this will throw error

        
    }
    
}
