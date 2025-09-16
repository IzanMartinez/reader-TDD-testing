import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {

    public static Map<String, Integer> analyze(String input) {
        Map<String, Integer> result = new HashMap<>();
        result.put("total", countCharacters(input));
        result.put("vowels", countVowels(input));
        result.put("consonants", countConsonants(input));
        result.put("numbers", countNumbers(input));
        result.put("specials", countSpecials(input));
        result.put("spaces", countSpaces(input));
        return result;
    }

    public static int countCharacters(String input) {
        int count = 0;
        for (char c : input.toCharArray())
            count++;
        return count;
    }

    public static int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray())
            if (Constants.VOWELS.contains(c))
                count++;
        return count;
    }


    public static int countNumbers(String input) {
        int count = 0;
        for (char c : input.toCharArray())
            if (Character.isDigit(c))
                count++;
        return count;
    }

    public static int countConsonants(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray())
            if (Character.isLetter(c) && !Constants.VOWELS.contains(c))
                count++;
        return count;
    }

    public static int countSpecials(String input) {
        int count = 0;
        for (char c : input.toCharArray())
            if (!Character.isLetter(c) && !Character.isDigit(c) && c != Constants.SPACE)
                count++;
        return count;
    }

    public static int countSpaces(String input) {
        int count = 0;
        for (char c : input.toCharArray())
            if (c == Constants.SPACE)
                count++;
        return count;
    }
}
