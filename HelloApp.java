import java.util.HashMap;

/**
 * HelloApp.java - A simple Java application
 *
 * UC 6: Display Banner Dynamically for Input Name
 * The app accepts a user's name via command-line argument and displays 
 * a personalized banner greeting using a HashMap for character patterns.
 *
 * @version 6.0
 */
public class HelloApp {

    // 1. Method to create and populate the HashMap
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        String[] patternH = { " * * ", " * * ", " ***** ", " * * ", " * * " };
        String[] patternE = { " ***** ", " * ", " **** ", " * ", " ***** " };
        String[] patternL = { " * ", " * ", " * ", " * ", " ***** " };
        String[] patternO = { "  *** ", " * * ", " * * ", " * * ", "  *** " };
        String[] patternW = { " * * ", " * * ", " * * * ", " ** ** ", " * * " };
        String[] patternR = { " **** ", " * * ", " **** ", " * * ", " * * " };
        String[] patternD = { " **** ", " * * ", " * * ", " * * ", " **** " };
        String[] patternSpace = { "       ", "       ", "       ", "       ", "       " };

        charMap.put('H', patternH);
        charMap.put('E', patternE);
        charMap.put('L', patternL);
        charMap.put('O', patternO);
        charMap.put('W', patternW);
        charMap.put('R', patternR);
        charMap.put('D', patternD);
        charMap.put(' ', patternSpace);

        return charMap;
    }

    // 2. Method to display the banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 5; 

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : message.toCharArray()) {
                // Fetch the pattern, default to space if character isn't in the map
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append("  "); 
            }
            System.out.println(sb.toString());
        }
    }

    // 3. Main execution method
    public static void main(String[] args) {
        
        // Initialize default name
        String name = "WORLD";
        
        // Check for command-line arguments and update name if present
        if (args.length > 0) {
            name = args[0].toUpperCase();
        }
        
        // Construct the final message
        String message = "HELLO " + name;
        
        // Load the map and render the banner
        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner(message, charMap);
    }
}