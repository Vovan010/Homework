import java.util.HashMap;
import java.util.Map;

//Задание 1
public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] wordsArray = {
                "apple", "banana", "orange", "apple", "kiwi", "banana",
                "orange", "grape", "kiwi", "apple", "mango", "banana",
                "kiwi", "grape", "apple", "orange", "banana", "grape"
        };

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordsArray) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
