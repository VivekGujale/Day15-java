package HashTable;

import java.util.*;

import java.util.Map;

public class HashTableUC2 {
    // Function to count frequency of
    // words in the given string
    static void frequency(String sentence) {
        //Map<String, Integer> map = new TreeMap<>();
        Hashtable<String, Integer> map = new Hashtable<>();

        // Splitting to find the word
        String arr[] = sentence.toLowerCase().split(" ");
        // Loop to iterate over the words
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Loop to iterate over the
        // elements opf the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "|" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        System.out.println("word -> Frequency");
        System.out.println("----------------");
        HashTableUC2.frequency(sentence);
    }
}