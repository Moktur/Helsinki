import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList <String> words = new ArrayList <String>();
        
        while (true) {
            System.out.println("Type a word: ");
            String s = reader.nextLine();
            if (s.isEmpty()) {
                break;
            } else {
                words.add(s);
            }
        }
        Collections.reverse(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
