/**
 * HelloApp.java - A simple Java application
 *
 * UC 5: Display "Hello" as Banner
 * The app uses an array of strings to display 'Hello' in a banner format.
 * This demonstrates how to represent graphical patterns using arrays and loops.
 *
 * @version 5.0
 */
public class HelloApp {
    
    public static void main(String[] args) {
        
        // 1. Create a String array to hold the banner lines
        String[] bannerLines = {
            " * * ***** * * *** ",
            " * * * * * * * ",
            " ***** ***** * * * * ",
            " * * * * * * * ",
            " * * ***** ***** ***** *** "
        };
        
        // 2. Use a for-each loop to iterate through the array and print each line
        // Read this as: "For every String 'line' inside 'bannerLines'..."
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}