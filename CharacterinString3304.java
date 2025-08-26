public class CharacterinString3304 {
    public static void main(String[] args) {
        int k = 5;
        System.out.println(kthCharacter(k));
    }
    public static char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                char nextChar = (char) ((c - 'a' + 1) % 26 + 'a');
                next.append(nextChar);
            }
            word.append(next);
        }
        return word.charAt(k-1);
    }
}
