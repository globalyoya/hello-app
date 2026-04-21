/**
 * HelloApp - UC7 - A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names
 *
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * or Default Message - The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user using the String.join()
 * method. If no names are provided, it should display "Hello, World!".
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the
 * console.
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Sujeet Kumar T S
 * @version 7.0
 * @since UC1
 */

// Key Concepts for HelloApp UC 7:
// 1. String.join() Method: A built-in method to concatenate strings with a delimiter
 * HelloApp - UC4 - A simple Java application that greets multiple users by name if 
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 * 
 * Greet Multiple Users - The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user.
 * Usage: java HelloAppUC4 [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 * 
 * @author Sujeet Kumar T S
 * @version 4.0
 * @since UC1
 */

// Key Concepts for HelloAppUC4:
// 1. Default Values: Providing a fallback value when no input is given
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Boolean Logic: Using logical conditions to control flow
// 5. Array Length: Checking the number of command-line arguments
// 6. Code Simplification: Reducing code complexity by leveraging built-in methods
// 7. Readability and Maintainability: Writing cleaner code with fewer lines and less 
//    manual string manipulation

// Sample Code for HelloApp UC 7:
// String names = "World";
// if (args.length > 0) {
//     names = String.join(", ", args);
// }


public class HelloApp {
    public static void main(String[] args) {
        String names = "World";
        if(args.length>0){
            names = String.join(", ", args);
        }
        System.out.println("Hello "+names+"!");
    }
}
// 6. StringBuilder: Efficiently building a string from multiple parts
// 7. Looping Constructs: Using for loops to iterate through command-line arguments
// 8. String Concatenation: Joining multiple strings with a delimiter (comma and space)

// Code Snippet for HelloApp UC4:
//StringBuilder nameBuilder = new StringBuilder();
//for (int i = 0; i < args.length; i++) {
//    nameBuilder.append(args[i]);
//    if (i < args.length - 1) {
//        nameBuilder.append(", ");
//    }
//}
//String name = nameBuilder.toString(); // Use the provided names

public class HelloApp{
    public static void main(String[] args) {
        //Default name
        String name = "world";

        //Check if a name is provided as a command-line argument
        if(args.length>0){
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                    nameBuilder.append(args[i]);
                        if (i < args.length - 1) {
                                nameBuilder.append(", ");}
                        }
             name = nameBuilder.toString(); // Use the provided names
             }
        System.out.println("Hello "+name+"!");
    }
}
