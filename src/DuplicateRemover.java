import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * The DuplicateRemover class provides a method to remove duplicate words
 * from an array of strings and return a sorted list of unique words.
 */
public class DuplicateRemover {

    /**
     * Removes duplicate words from the input array, sorts them in lexicographic order,
     * and returns a list of unique words.
     *
     * @param words an array of strings that may contain duplicate words
     * @return a sorted List<String> containing unique words from the input array
     */
    public static List<String> sortAndRemoveDuplicates(String[] words) {
        //use tree set to store unique words by creatung a new TreeSet
        Set<String> unique = new TreeSet<>();
        //doing a for loop to iterate through the array
        for(String word : words){
            //adding each word to the set by using the add method
            //if the word is already in the set, it will not be added again, meaning duplicates are removed
            unique.add(word);
        }

        //convert the set to a list and in order to return it
        List<String> wordList = new ArrayList<>();
        //using a for loop to iterate through the set
        for(String word : unique){
            //adding each unique word to the list, which will be sorted automatically due to the nature of TreeSet
            wordList.add(word);
        }   

        return wordList;
    }

    public static void main(String[] args) {
        String[] words = {"yes", "no", "maybe", "yes", "yes"};
        List<String> uniqueWords = sortAndRemoveDuplicates(words);
        System.out.println(uniqueWords);
    }
}
