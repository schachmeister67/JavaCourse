package operators;


/**
 * An Operator is a character that represents an action.
 * 
 * Types of Operators in Java:
 * 1. Arithmetic: + - * / %
 * 2. Assigment: = += -= *= /= %=
 * 3. Auto-Increment and Auto-Decrement: ++ --
 * 4. Logical Operators: && || ! (used for conditional statements)
 * 5. Comparison (Relational): == != > < >= <=
 * 6. Bitwise: & ! ^ - << >>
 * 7. Ternary: evaluates a boolean expression and assigns the value based on the result
 *    Syntax: variable num1 = (expression) ? value if true : value if false
 *
 */
public class Operators
{

    public static void main(String args[]) {
        //arithmeticOperatorsMethod();
        //assignmentOperatorsMethod();
        //autoIncrementDecrementMethod();
        //logicalOperatorsMethod();
        //comparisonOperatorsMethod();
        //bitwiseOperatorsMethod();
        ternaryOperatorsMethod();
        
    }

    public static void arithmeticOperatorsMethod()
    {
        int num1 = 100;
        int num2 = 20;
        
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        // % is for modulo and returns the remainder of a division: 10/5 yields 0
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
    
    public static void assignmentOperatorsMethod()
    {
        int num1 = 10;
        int num2 = 20;
        
        num2 = num1; // assigns the value of num1 to num2
        System.out.println("= Output: " + num2);
        
        num2 += num1; // num2 = num2 + num1
        System.out.println("+= Output: " + num2);
        
        num2 -= num1; // num2 = num2 - num1
        System.out.println("-= Output: " + num2);
        
        num2 *= num1; // num2 = num2 * num1
        System.out.println("*= Output: " + num2);
        
        num2 /= num1; // num2 = num2 / num1
        System.out.println("/= Output: " + num2);
        
        num2 %= num1; // num2 = num2 % num1
        System.out.println("%= Output: " + num2);

    }
    
    public static void autoIncrementDecrementMethod()
    {
        int num1 = 100;
        int num2 = 200;
        
        num1++; // num1 = num1 + 1
        System.out.println("num1++ is: " + num1);
        
        num2--; // num2 = num2 - 1
        System.out.println("num2-- is: " + num2);
    }
    
    public static void logicalOperatorsMethod()
    {
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println("b1 && b2: " + (b1&&b2)); // return true if both b1 and b2 are true
        
        System.out.println("b1 || b2: " + (b1||b2)); // return false if both b1 and b2 are false

        System.out.println("!(b1&&b2): " + !(b1&&b2)); // return the opposite of the evaluation
    }
    
    public static void comparisonOperatorsMethod()
    {
        int num1 = 10;
        int num2 = 50;
        
        if (num1 == num2) {
            System.out.println("num1 and num2 are equal!");
        } else {
            System.out.println("num1 and num2 are not equal!");
        }
        
        if (num1 != num2) {
            System.out.println("num1 and num2 are not equal!");
        } else {
            System.out.println("num1 and num2 are equal!");
        }
        
        if (num1 > num2) {
            System.out.println("num1 is greater than num2!");
        } else {
            System.out.println("num1 is not greater than num2!");
        }
        
        if (num1 >= num2) {
            System.out.println("num1 is greater than or equal to num2!");
        } else {
            System.out.println("num1 is not greater than or equal to num2!");
        }
        
        if (num1 < num2) {
            System.out.println("num1 is less than num2!");
        } else {
            System.out.println("num1 is not less than num2!");
        }
        
        if (num1 <= num2) {
            System.out.println("num1 is less than or equal to num2!");
        } else {
            System.out.println("num1 is not less than or equal to num2!");
        }
    }
    
    public static void bitwiseOperatorsMethod()
    {
        // Bitwise operators perform bit by bit processing
        
        int num1 = 11; // 11 = 00001011 (binary code for 11)
        int num2 = 22; // 22 = 00010110 (binary code for 22)
        int result = 0;
        
        result = num1 & num2; // compare bit by bit and return 1 if both bits are equal
        System.out.println("num1 & num2: " + result); // return 2 which is 00000010
        
        result = num1 | num2; // compare bit by bit and return 1 if either bit is 1
        System.out.println("num1 | num2: " + result); // return 31 which is 00011111 
       
        result = num1 ^ num2; // compare bit by bit and return 1 if both bits are not equal
        System.out.println("num1 ^ num2: " + result); // return 29 which is 00011101
        
        result = -num1; // change each bit from 1 to 0 and 0 to 1
        System.out.println("-num1: " + result); // returns -11 which is 11110100
        
        result = num1 << num2; // shift the bits to the left, discard the far left bit, assign the rightmost bit the value of 0
        System.out.println("num1 << num2: " + result);
        
        result = num1 >> num2; // shift the bits to the right, discard the far right bit, assign the leftmost bit the value of 0
        System.out.println("num1 >> num2: " + result);
    }
    
    public static void ternaryOperatorsMethod()
    {
        int num1, num2;
        num1 = 25;
        
        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);
        
        num2 = (num1 == 25) ? 100 : 200;
        System.out.println("num2: " + num2);
        
    }
}
