public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int character_s[] = new int[26];
        int character_t[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            character_s[s.charAt(i) - 'a']++;
            character_t[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (character_s[i] != character_t[i]) {
                return false;
            }
        }

        return true;
    }
}
