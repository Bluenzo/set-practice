import java.util.HashSet;
import java.util.Set;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        // Create a HashSet to store elements from the first array
        HashSet<Integer> set1 = new HashSet<>();
        // Iterate through the first array and add each element to the set
        for(int num1 : array1) {
            set1.add(num1);
        }

        // Create a HashSet to store common elements
        HashSet<Integer> commonElements = new HashSet<>();
        // Iterate through the second array
        for(int num2 : array2){
            // Check if the current element is in the first set
            if(set1.contains(num2)) {
                // If it is, add it to the common elements set
                commonElements.add(num2);
            }
        }
        // Return the set of common elements
        return commonElements;
        
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
