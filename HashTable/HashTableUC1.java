package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableUC1 {
    // Function to count frequency of
    // words in the given string
    static void frequency(String sentence) {
        Hashtable<String, Integer> map = new Hashtable<>();

        // Splitting to find the word
        String arr[] = sentence.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // mapping elements
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  ->  " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sentence = "To be or not to be";
        System.out.println("word -> Frequency");
        System.out.println("----------------");
        HashTableUC1.frequency(sentence);
    }
}
