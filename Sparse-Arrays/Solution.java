import java.util.*;

public class Solution {
    public static List<Integer> matchingStrings(
            List<String> stringList,
            List<String> queries) {

        Map<String, Integer> frequency = new HashMap<>();

        for (String s : stringList) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (String query : queries) {
            result.add(frequency.getOrDefault(query, 0));
        }

        return result;
    }
}
