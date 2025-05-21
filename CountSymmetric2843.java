public class CountSymmetric2843 {
    public static int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(i>10 && i<100){
                if(i%10==i/10){
                    count++;
                }
            }else if(i>1000 && i<10000){
                int d1 = i / 1000;              
                int d2 = (i / 100) % 10;        
                int d3 = (i / 10) % 10;        
                int d4 = i % 10;                

                int leftSum = d1 + d2;
                int rightSum = d3 + d4;

                if (leftSum == rightSum) {
                    count++;
            }
        }
    }
    return count;
    }
    public static void main(String[] args) {
        int low = 1, high = 100;
        System.out.println(countSymmetricIntegers(low, high));
    }
}
