public class FancyString1957 {
    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }

    public static String makeFancyString(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count < 3) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
