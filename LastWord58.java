public class LastWord58 {
    public static void main(String[] args) {
        String s = "Hello World ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(count>0)
                    return count;
            }else{
                count++;
            }
        }
        return count;
    }
}
