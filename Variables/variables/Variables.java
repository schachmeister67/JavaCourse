package variables;


/**
 * Variables define storage in the computer's memory in order to manipulate data.
 * 
 * How to declare a variable:
 * data_type variable_name = some_value;
 * 
 * There are 3 types of variables in Java:
 * 1. Local: A local variable is visible or alive only within the class or method definition.
 * 2. Static: A static variable is associated to the class only and not objects of the class.
 * 3. Instance: An instance variable is associated to each object created from a class.
 *
 * Note: The 3 types of variables deal with the scope of execution of a Java program.
 */
public class Variables
{
    // instance variables - replace the example below with your own
    public static String myClassVar = "static variable";
    public String myInstanceVar = "instance variable";
    public String myVar = "instance level variable";

    public static void main(String args[]) {
        //staticVariablesMethod();
        //instanceVariablesMethod();
        localVariablesMethod();
        
    }

    public static void staticVariablesMethod()
    {
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();
        Variables obj3 = new Variables();
        
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        
        obj1.myClassVar = "static variable changed!";
        
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }
    
    public static void instanceVariablesMethod()
    {
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();
        Variables obj3 = new Variables();
        
        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
        
        obj1.myInstanceVar = "instance variable changed for obj1!";
        
        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
    
    public static void localVariablesMethod()
    {
        String myVar = "local method variable";
        
        Variables obj = new Variables();
        
        System.out.println(myVar);
        System.out.println(obj.myVar);
    }
}
