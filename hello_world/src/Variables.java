public class Variables {
    public static void main(String[] args) {

        // Identifier rules in java
/*          Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter and it cannot contain whitespace
            Names can also begin with $ and _ 
            Names are case sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/

        // Simple variable declerations
        byte byteVar = 10;           // Byte variable -128 to +127
        short shortVar = 10;         // Short variable
        int myNum = 5;               // Integer (whole number)
        long longVar = 1500000000L;  // Long variable
        float myFloatNum = 5.99f;    // Floating point number
        double doubleVar = 5.88878d; // Double var
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        // Scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;

        // Final and const variables
        final int myVar;
        myVar = 3;
        // System.out.print(myVar);

        // Data types are divided into two groups:
/*          Primitive data types - includes byte, short, int, long, float, double, boolean and char
            Non-primitive data types - such as String, Arrays and Classes
*/
/*          The main difference between primitive and non-primitive data types are:

            Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
            Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
            A primitive type has always a value, while non-primitive types can be null.
            A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
            The size of a primitive type depends on the data type, while non-primitive types have all the same size.
*/

}
    
}
