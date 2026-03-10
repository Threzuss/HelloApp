/**
 * HelloApp.java - A simple Java application
 *
 * UC 2: Display User Name - The application should accept a user's name as 
 * a command-line argument and display a personalized greeting.
 *
 * @version 2.0
 */
public class HelloApp {
    
    public static void main(String[] args) {
        
        // Check if at least one command-line argument was provided
        if (args.length > 0) {
            // Get the first command-line argument
            String name = args[0];
            
            // Display personalized greeting using String concatenation (+)
            System.out.println("Hello, " + name + "!");
        } else {
            // Default fallback message if no arguments are passed
            System.out.println("Hello, World!");
        }
    }
}