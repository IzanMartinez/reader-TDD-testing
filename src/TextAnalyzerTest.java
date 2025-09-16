import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {
    @Test
    void shouldReturn0IfVoid() {
        String input = "";
        int expected = 0;
        int actual = TextAnalyzer.countVowels(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountEveryCharCorrectly() {
        String input = "Hello world!";
        int expected = 12;
        int actual = TextAnalyzer.countCharacters(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountVowelsCorrectly() {
        String input = "Hello world!";
        int expected = 3;
        int actual = TextAnalyzer.countVowels(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountNumbersCorrectly() {
        String input = "He110 w0r1d!";
        int expected = 5;
        int actual = TextAnalyzer.countNumbers(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountConsonantsCorrectly() {
        String input = "Hello world!";
        int expected = 7;
        int actual = TextAnalyzer.countConsonants(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSpecialCharactersCorrectly() {
        String input = "Hello, world...";
        int expected = 4;
        int actual = TextAnalyzer.countSpecials(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSpacesCorrectly() {
        String input = "H e l l o   w o r l d !";
        int expected = 12;
        int actual = TextAnalyzer.countSpaces(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountEverythingCorrectly() {
        String input = "H e l l 0 ,   w 0 r l d !";
        int expectedVowels = 1;
        int expectedNumbers = 2;
        int expectedConsonants = 7;
        int expectedSpecials = 2;
        int expectedSpaces = 13;
        int actualVowels = TextAnalyzer.countVowels(input);
        int actualNumbers = TextAnalyzer.countNumbers(input);
        int actualConsonants = TextAnalyzer.countConsonants(input);
        int actualSpecials = TextAnalyzer.countSpecials(input);
        int actualSpaces = TextAnalyzer.countSpaces(input);
        assertEquals(expectedVowels, actualVowels);
        assertEquals(expectedNumbers, actualNumbers);
        assertEquals(expectedConsonants, actualConsonants);
        assertEquals(expectedSpecials, actualSpecials);
        assertEquals(expectedSpaces, actualSpaces);
    }

    @Test
    void shouldAnalyzeTextCorrectly() {
        String input = "Hell0, W0rld!";

        Map<String, Integer> expected = Map.of(
                "total", 13,
                "vowels", 1,
                "consonants", 7,
                "numbers", 2,
                "specials", 2,
                "spaces", 1
        );

        Map<String, Integer> actual = TextAnalyzer.analyze(input);

        assertEquals(expected, actual);
    }


}