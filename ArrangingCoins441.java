public class ArrangingCoins441 {
    public static void main(String[] args) {
        int n = 8;
        System.out.print(arrangeCoins(n));
    }
    public static int  arrangeCoins(int n)  {
        int k=1,count=1;
        while(n>=count){
            n-=k++;     
            count++;
        }
        return count-1;
    }
}
