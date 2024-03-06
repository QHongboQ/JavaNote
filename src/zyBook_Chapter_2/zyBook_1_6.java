package zyBook_Chapter_2;

public class zyBook_1_6
/* Definition of class: A programmer-defined data type
 *Definition of method: A sequence of statements that has a name, may have parameter variables, and may return a value.
 *A method can be invoked any number of times, with different values for its parameter variables.
 *Definition of main method: The method that is first called when a Java application executes.
 *Definition of statement: A syntactical unit in a program.
 *Definition of argument: A value supplied in a method call, or one of the values combined by an operator.
 * 所有的代码都是source code，Java compiler translates your source files into class files
 *Definition of integrated development environment: A programming environment that includes an editor, compiler, and debugger
 *有了integrated development environment 才可以进行代码编写
 */
{
    public static void main(String[] args)
    {
        System.out.println(3 + 4); // Prints 7

        System.out.println("Hello"); // Prints "Hello World!" in two lines
        System.out.println("World!");

        System.out.print("00"); // Prints 00 but doesn't start a new line
        System.out.println(3 + 4); // Prints 7 and starts a new line

        System.out.println("Goodbye");
    }
}
