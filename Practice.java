public class Practice {
    public static void main(String[] args) {
        String s ="abacbc";
        System.out.println(areOccurrencesEqual(s)); 
    }
    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];  
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }   

        int expected = 0;

        for (int i = 0; i < freq.length; i++) {
            int f = freq[i];
            if(f>0){
                if(expected == 0){
                    expected =f;
                }else if (f != expected) {
                    return false;
                }
            }
        }

        return true;
    }
}
