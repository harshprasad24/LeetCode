import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lexicographically3170 {
    public static void main(String[] args) {
        String s = "abc**";
        System.out.println(clearStars(s));
    }

    public static String clearStars(String s) {
        TreeMap<Character, TreeSet<Integer>> map = new TreeMap<>();
        List<Character> result = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                result.add(c);
                map.putIfAbsent(c, new TreeSet<>());
                map.get(c).add(result.size() - 1);
            } else {
                // Get smallest char
                char minChar = map.firstKey();
                TreeSet<Integer> indices = map.get(minChar);
                int idxToRemove = indices.last(); // rightmost occurrence
                indices.remove(idxToRemove);
                if (indices.isEmpty()) {
                    map.remove(minChar);
                }
                result.set(idxToRemove, null); // mark as removed
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : result) {
            if (c != null) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
