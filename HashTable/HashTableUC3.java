package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableUC3 {
    static void removeWord(String sentence, String word) {
        Hashtable<String, Integer> map = new Hashtable<>();
        String arr[] = sentence.split(" ");
        String newString = " ";
        for (String words : arr) {
            if (!words.equals(word)) {
                newString = newString + words + " ";
            }
        }
        //printing the new string
        System.out.println(newString);
    }


    public static void main(String[] args) {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        String word = "avoidable";
        HashTableUC3.removeWord(sentence, word);
    }
}
