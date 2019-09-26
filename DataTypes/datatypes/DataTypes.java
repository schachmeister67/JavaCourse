package datatypes;


/**
 * There are 4 data types for storing integers:
 * 
 * byte: 1 byte storage range: -128 to 127
 * short: 2 bytes storage range: -32768 to 32767
 * int: 4 bytes storage range: -2^31 to 2^31-1
 * long: 8 bytes storage range: -2^63 to 2^63-1
 *
 * There are 2 data types for storing floating point numbers:
 * 
 * float: 4 bytes storage range: -3.40282347x10^38 to +3.40282347x10^38 precision: 7 digits
 * double: 8 bytes storage range: -1.79769313486231570x10^308 to +1.79769313486231570x10^308 precision: 15 digits
 * 
 * 2 other data types:
 * 
 * char: 2 bytes storage range: single unicode characters
 * boolean: special data type that can hold 2 values true or false
 * 
 */
public class DataTypes
{
    public static void main(String[] args) {
        //byte: 1 byte storage range: -128 to 127
        byte userAge = 20;
        System.out.println(userAge);
        
        //short: 2 bytes storage range: -32768 to 32767
        short numOfStudents = 15;
        System.out.println(numOfStudents);
        
        //int: 4 bytes storage range: -2^31 to 2^31-1
        int numOfEmployees = 5;
        System.out.println(numOfEmployees);
        
        //long: 8 bytes storage range: -2^63 to 2^63-1
        long numOfStars = 21021313012678L;
        System.out.println(numOfStars);
        
        //float: 4 bytes storage range: -3.40282347x10^38 to +3.40282347x10^38 precision: 7 digits
        float hourlyRate = 10.5F;
        System.out.println(hourlyRate);
        
        //double: 8 bytes storage range: -1.79769313486231570x10^308 to +1.79769313486231570x10^308 precision: 15 digits
        double numOfHours = 45.5;
        System.out.println(numOfHours);
        
        //char: 2 bytes storage range: single unicode characters
        char grade = 'A';
        System.out.println(grade);
        
        //boolean: special data type that can hold 2 values true or false
        boolean promote = true;
        System.out.println(promote);  
        
        
    }
}
