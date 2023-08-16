
import java.util.HashMap;

	public class Home {
	    public static void main(String[] args) {
	        String inputText = "Hello World!";
	        HashMap<Character, Integer> charOccurrences = countCharacterOccurrences(inputText);

	        // Print the occurrences of each character
	        for (Character c : charOccurrences.keySet()) {
	            System.out.println(c + ": " + charOccurrences.get(c));
	        }
	    }

	    public static HashMap<Character, Integer> countCharacterOccurrences(String text) {
	        HashMap<Character, Integer> charOccurrences = new HashMap<>();

	        // Remove spaces from the text
	        text = text.replaceAll(" ", "");

	        // Loop through each character in the text
	        for (char c : text.toCharArray()) {
	            // Ignore case (if needed, uncomment the next line)
	            // c = Character.toLowerCase(c);

	            // Check if the character is already in the map
	            if (charOccurrences.containsKey(c)) {
	                // If it is, increment the count
	                charOccurrences.put(c, charOccurrences.get(c) + 1);
	            } else {
	                // If it's not, add it to the map with count 1
	                charOccurrences.put(c, 1);
	            }
	        }

	        return charOccurrences;
	    }
	}
