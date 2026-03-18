/**
 * HelloApp.java - A simple Java application
 *
 * UC 3: Display "Hello" with Command-Line Argument or Default Message
 * The application displays a personalized greeting if a name is provided,
 * otherwise it defaults to greeting the "World".
 *
 * @version 3.0
 */
public class HelloApp {
    
    public static void main(String[] args) {
        
        // 1. Declare and initialize the variable with a default value
        String name = "World";
        
        // 2. Control flow: Reassign the variable ONLY if an argument exists
        if (args.length > 0) {
            name = args[0];
        }
        
        // 3. A single, clean print statement handles both scenarios
        System.out.println("Hello, " + name + "!");
    }
}