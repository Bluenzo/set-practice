import java.util.HashSet;

/**
 * The UniqueCharacterChecker class provides a method to check if all characters
 * in a given word are unique.
 */
public class UniqueCharacterChecker {

    /**
     * Checks if a given word has all unique characters.
     *
     * @param word the string to be checked for unique characters
     * @return true if all characters in the word are unique; false otherwise
     */
    public static boolean hasUniqueCharacters(String word) {
        // TODO: implement this!
        // Create a HashSet to store characters we've seen
        HashSet<Character> uniqueChar = new HashSet<>();
        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            // Check if the character is already in the set
            if (uniqueChar.contains(currentChar)) {
                return false; // Duplicate found
            }
            // Add the character to the set
            uniqueChar.add(currentChar);
        }
        // Requirement: This must run in O(n) time, where n is the number of characters in the word
        // Hint: Stuck? Consider looking up "charAt" and seeing how it can help you

        return true; // All characters are unique
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "world";
        String word3 = "abcdefg";

        System.out.println(word1 + " has unique characters: " + hasUniqueCharacters(word1));
        System.out.println(word2 + " has unique characters: " + hasUniqueCharacters(word2));
        System.out.println(word3 + " has unique characters: " + hasUniqueCharacters(word3));

        
    }
}
