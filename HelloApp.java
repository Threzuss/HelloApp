import java.util.HashMap;

/**
 * HelloApp.java - A simple Java application
 *
 * UC 7: Using Constants for Banner Content
 * The app refactors the application to use a constant for the default 
 * greeting message, avoiding hardcoded values and improving maintainability.
 *
 * @version 7.0
 */
public class HelloApp {

    // 1. Define the constant at the class level.
    // 'public' so it's accessible, 'static' so it belongs to the class, 
    // and 'final' so its value can never be changed.
    public static final String DEFAULT_GREETING = "HELLO";

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

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 5; 

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append("  "); 
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        
        String name = "WORLD";
        
        if (args.length > 0) {
            name = args[0].toUpperCase();
        }
        
        // 2. Use the constant instead of a hardcoded string
        String message = DEFAULT_GREETING + " " + name;
        
        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner(message, charMap);
    }
}