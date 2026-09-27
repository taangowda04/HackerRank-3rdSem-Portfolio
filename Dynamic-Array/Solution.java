import java.util.*;

public class Solution {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else {
                int size = arr.get(idx).size();
                lastAnswer = arr.get(idx).get(y % size);
                result.add(lastAnswer);
            }
        }

        return result;
    }
}
