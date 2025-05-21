public class ClearDigits3174 {
    public static void main(String[] args) {
        String s = "cba34";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<sb.length()){
            if(Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i=0;
            }
            i++;
        }
        return sb.toString();
    }
}
