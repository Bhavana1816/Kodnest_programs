import java.util.HashMap;
import java.util.Map;

public class Home2{

    private static Object sort;

	public static Map<Character, Integer> countCharacters(String text) {
        // Initialize a HashMap to store character occurrences
        Map<Character, Integer> charCount = new HashMap<>();

        // Loop through each character in the text
        for (char ch : text.toCharArray()) {
            // Ignore spaces
            if (ch != ' ') {
                // Check if the character is already in the HashMap
                if (charCount.containsKey(ch)) {
                    // If it is, increment the count
                    charCount.put(ch, charCount.get(ch) + 1);
                } else {
                    // If it's not, add it to the HashMap with count 1
                    charCount.put(ch, 1);
                }
            }
        }}

    

	public static void main(String[] args) {
        String inputText = "Hello World!";
        Map<Character, Integer> result = countCharacters(inputText);

        // Display the character occurrences
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
