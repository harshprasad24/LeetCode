public class ValidWord3136 {
    public static void main(String[] args) {
        String word = "234Adas";
        System.out.println(isValid(word));
    }

    public static boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lowerCh) >= 0) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }
        return hasVowel && hasConsonant;
        
    }
}