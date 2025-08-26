public class DivideString2138 {
    public static void main(String[] args) {
        String s = "abcdefghi";
        char fill = 'x';
        int k = 3;
        String ans[] = divideString(s, k, fill);
        for (String str : ans) {
            System.out.println(str);
        }
    }

    public static String[] divideString(String s, int k, char fill) {
        int groups = (s.length() + k - 1) / k;
        String arr[] = new String[groups];
        int indx = 0;
        for (int i = 0; i < groups; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                if (indx < s.length()) {
                    sb.append(s.charAt(indx++));
                } else {
                    sb.append(fill);
                }
            }
            arr[i] = sb.toString();
        }
        return arr;
    }
}
