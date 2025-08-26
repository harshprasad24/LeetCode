public class Lc_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String s = sentences[i];
            int count =1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
