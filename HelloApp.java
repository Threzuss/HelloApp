/**
 * HelloApp.java - A simple Java application
 *
 * UC 4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 * The application iterates through all provided command-line arguments and 
 * prints a personalized greeting for each. If none are provided, it defaults to "World".
 *
 * @version 4.0
 */
public class HelloApp {
    
    public static void main(String[] args) {
        
        // 1. Check if the array is empty (no arguments provided)
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // 2. Loop through the array if arguments exist
            // i starts at 0 (first index), runs as long as i is less than the array length
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello, " + args[i] + "!");
            }
        }
    }
}