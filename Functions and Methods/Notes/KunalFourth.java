// KunalFourth.java

import java.util.Arrays;
import java.util.Scanner;

// NOTE: IMPORTANT NOTE: A VARIABLE CAN ONLY BE ACCESSED WITHIN THE SCOPE OF THE BLOCK IN WHICH IT WAS DECLARED, SO WITHIN THE CURLY BRACKETS IT WAS DECLARED IN
public class KunalFourth {
    static int x = 10; // NOTE: This is a global variable, it can be accessed anywhere in the class because it was declared outside the main method
    static int y = 20; // INFO: This is shadowed by the local variable 'y' in the main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y = 30; // INFO: This will shadow the global variable 'y' which is the higher level scope
        // NOTE: THE HIGHER LEVEL SCOPE IS ALWAYS SHADOWED BY THE LOWER LEVEL SCOPE

        // HACK: INITIALIZING EXAMPLES:
        // int a = 10; // INFO: This is a primitive initialization, IT IS ALSO KNOWN AS DECLARATION AND INITIALIZATION
        // String b = "Kunal"; // INFO: This is a String initialization, IT IS ALSO KNOWN AS DECLARATION AND INITIALIZATION

        // HACK: DECLARING EXAMPLES:
        // int a; // INFO: This is a primitive declaration
        // String b; // INFO: This is a String declaration

        // HACK: UPDATING EXAMPLES:
        // a = 10; // INFO: This is a primitive updating because a was already declared and maybe even initialized
        // b = "Kunal"; // INFO: This is a String updating because b was already declared and maybe even initialized

        int num1, num2, sum; // NOTE: Variables can be declared in a single line
        System.out.print("Enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.print("Sum of two numbers is: " + sum);

        int a = 10;
        a = 10;
        {
            // NOTE: THIS IS CALLED BLOCK SCOPING
            int c = 99; // This variable is only accessible within this block, outside the block it can never be accessed
            a = 100; // This will change the value of a to 100 both inside AND outside the block
            // INFO: So, variables declared inside a block CANNOT be accessed outside the block, like c in this case
            // INFO: But variables declared outside a block that were modified in a block will change the value of the variable outside the block, like a in this case
            // int a = 99; // BUG: ERROR BECAUSE 'a' IS ALREADY DECLARED IN THE OUTER BLOCK
        }
        int c = 9; // NOTE: NOT ERROR BECAUSE ANY VARIABLE DECLARED INSIDE A BLOCK CANNOT BE ACCESSED OUTSIDE THE BLOCK, SO 'c' CAN BE REINITIALIZED
        System.out.println(a); // This will print 100 because the value of a was changed to 100 inside the block
        // System.out.println(c); // BUG: IF 'c' WAS NOT REDECLARED, THEN IT WOULD BE AN ERROR BECAUSE C IS NOT ACCESSIBLE OUTSIDE THE BLOCK
        {
            // HACK: THIS IS CALLED LOOP SCOPING
            for (int i = 0; i < 5; i++) { // INFO: ANY VARIABLE DECLARED INSIDE A LOOP CANNOT BE ACCESSED OUTSIDE THE LOOP, SO 'i' CANNOT BE ACCESSED OUTSIDE THE LOOP
                int num = 10; // INFO: 'num' CANNOT BE ACCESSED ANYWHERE EXCEPT INSIDE THE LOOP
                a = 20; // INFO: 'a' CAN BE ACCESSED OUTSIDE THE LOOP BECAUSE IT WAS DECLARED OUTSIDE THE LOOP
            }
            // System.out.println(num); // BUG: ERROR BECAUSE 'num' IS NOT ACCESSIBLE OUTSIDE THE LOOP, EVEN IF IT IS DECLARED IN THE SAME BLOCK
        }
    }
    // NOTE: IF YOU DO NOT KNOW HOW MANY ARGUMENTS ARE GOING TO BE PASSED, YOU CAN USE VARARGS, THIS IS AN EXAMPLE:
    static void varargs(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    // NOTE: YOU CAN ALSO USE VARARGS WITH DIFFERENT TYPES OF ARGUMENTS, THIS IS AN EXAMPLE:
    static void varargs(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
    // NOTE: HOWEVER, IT ALWAYS HAS TO BE THE LAST PARAMETER IN THE METHOD
    // static void varargs(String ...v, int a) {}
        // NOTE: THIS IS AN ERROR BECAUSE THE VARARGS PARAMETER IS NOT THE LAST PARAMETER
}