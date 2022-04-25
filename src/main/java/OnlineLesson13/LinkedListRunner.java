package OnlineLesson13;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class LinkedListRunner {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Skoda");
        words.add("Lada");
        words.add("BMW");
        words.add("BMW");
        words.add("BdasW");
        words.add("MW");
        words.add("BW");
        ListIterator<String> wordListIterator = words.listIterator();
//        while (wordListIterator.hasNext()) {
//            String word = wordListIterator.next();
//        }
//        while (wordListIterator.hasNext()) {
//            String word = wordListIterator.previous();
//        }
        System.out.println(words);
        for(String word: words) {
            if (new Random().nextBoolean()) {
                words.remove(word);
            }
        }
        System.out.println(words);
    }

}
