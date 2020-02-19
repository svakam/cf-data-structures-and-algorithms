package repeatedword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

public class RepeatedWord {
    public String findFirstRepeat(String filepath) throws FileNotFoundException {
        String currentWord = "";
        Hashtable<String, Integer> ht = new Hashtable<>();
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            currentWord = sc.next().toLowerCase();

            // parses out punctuation that comes after a character
            String newWord = currentWord.replaceAll(",", "");

            if (ht.containsKey(newWord)) {
                return newWord;
            } else {
                ht.put(newWord, 0);
            }
        }
        return currentWord;
    }
}
