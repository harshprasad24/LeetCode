import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        String s = "leetcode";
        ArrayList<String> wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int j = 0;
        while (j < s.length()) {
            boolean matched = false;
            for (String word : wordDict) {
                int len = word.length();
                if (j + len <= s.length() && s.substring(j, j + len).equals(word)) {
                    j += len;
                    matched = true;
                    break; 
                }
            }
            if (!matched) {
                return false; 
            }
        }
        return true;
    }
}

