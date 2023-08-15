package Assessment.Question3;

import java.util.*;

public class Anagram {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String normalized = new String(charArray);

            anagramGroups.putIfAbsent(normalized, new ArrayList<>());
            anagramGroups.get(normalized).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] words = {
                "Listen" ,"Silent",
                "A gentleman", "Elegant man",
                "Dormitory", "Dirty room",
                "The eyes", "They see",
                "Astronomer", "MoonStarer"
        };

        List<List<String>> anagramGroups = groupAnagrams(words);

        System.out.println("Anagram Groups:");
        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    }
}
