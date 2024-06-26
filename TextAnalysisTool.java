import java.util.*;

public class TextAnalysisTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: User Input
        System.out.println("Please enter a paragraph or a lengthy text:");
        String text = scanner.nextLine().trim();

        // Step 2: Character Count
        int charCount = text.length();
        System.out.println("Total number of characters: " + charCount);

        // Step 3: Word Count
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);

        // Step 4: Most Common Character
        char mostCommonChar = getMostCommonCharacter(text);
        System.out.println("Most common character: " + mostCommonChar);

        // Step 5: Character Frequency
        System.out.println("Please enter a character to find its frequency:");
        char userChar = scanner.next().trim().toLowerCase().charAt(0);
        int charFrequency = getCharacterFrequency(text, userChar);
        System.out.println("Frequency of '" + userChar + "': " + charFrequency);

        // Step 6: Word Frequency
        System.out.println("Please enter a word to find its frequency:");
        scanner.nextLine(); // consume the leftover newline
        String userWord = scanner.nextLine().trim().toLowerCase();
        int wordFrequency = getWordFrequency(words, userWord);
        System.out.println("Frequency of '" + userWord + "': " + wordFrequency);

        // Step 7: Unique Words
        int uniqueWordCount = getUniqueWordCount(words);
        System.out.println("Number of unique words: " + uniqueWordCount);

        scanner.close();
    }

    private static char getMostCommonCharacter(String text) {
        text = text.toLowerCase().replaceAll("\\s", "");
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return Collections.max(charCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    private static int getCharacterFrequency(String text, char userChar) {
        text = text.toLowerCase();
        int frequency = 0;
        for (char c : text.toCharArray()) {
            if (c == userChar) {
                frequency++;
            }
        }
        return frequency;
    }

    private static int getWordFrequency(String[] words, String userWord) {
        int frequency = 0;
        for (String word : words) {
            if (word.toLowerCase().equals(userWord)) {
                frequency++;
            }
        }
        return frequency;
    }

    private static int getUniqueWordCount(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords.size();
    }
}
