public class plusone {
    public static void main(String[] args) {
        int digits[]={9};
        int plus[]=plusOne(digits);
        for (int i = 0; i < digits.length+1; i++) {
            System.out.println(plus[i]);   
        }
    }
    public static int[] plusOne(int[] digits) {
        int k =digits.length;
        for (int i = k-1; i >=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int newdigit[] = new int[k+1];
        newdigit[0]=1;
        return newdigit ;
    }
}

