public class AtMostOne1784 {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(checkOnesSegment(s)); 
    }
      public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
        // for(int i=0;i<s.length()-1;i++){
        //     if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
        //         return true;
        //     }
        // }
        // return false;
    }
}
