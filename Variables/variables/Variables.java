package variables;


/**
 * Variables define storage in the computer's memory in order to manipulate data.
 * 
 * How to declare a variable: data_type variable_name = some_value;
 * 
 * Scope is the part of a class where a variable is accessible:
 * 1. Class variables (member variables) are accessible to a class.
 * 2. Local variables (method variables) are accessible to a method.
 * 3. Block variables are accessible inside a pair of brackets { and }.
 * 4. Instance variables (object variables) are accessible to an instance of a class.
 * 
 */
public class Variables
{
    public static String myClassVar = "class variable";
    public String myInstanceVar = "instance variable";
    public String myVar = "instance variable";

    public static void main(String args[]) {
        //classVariablesMethod();
        //localVariablesMethod();
        //instanceVariablesMethod();        
        
    }

    public static void classVariablesMethod()
    {
        System.out.println(myClassVar);
        
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();
        Variables obj3 = new Variables();
        
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        
        obj1.myClassVar = "obj1 variable";
        obj2.myClassVar = "obj2 variable";
        
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }
    
    public static void localVariablesMethod()
    {
        String myVar = "local method variable";
        
        Variables obj = new Variables();
        
        System.out.println(myVar);
        System.out.println(obj.myVar);
    }
    
    public static void blockVariablesMethod()
    {
        {
            String myBlockVar = "block variable";
            System.out.println(myBlockVar + " is accessible only within the brackets");
        }
        
        //Uncomment the line below and see what happens
        //System.out.println(myBlockVar);
    }
    
    public static void instanceVariablesMethod()
    {
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();
        Variables obj3 = new Variables();
        
        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
        
        obj1.myInstanceVar = "obj1 instance variable changed!";
        obj2.myInstanceVar = "obj2 instance variable changed...";
        obj3.myInstanceVar = "obj3 instance variable changed!!!";
        
        System.out.println(obj1.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }

}
