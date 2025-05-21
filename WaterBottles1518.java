public class WaterBottles1518 {
    public static void main(String[] args) {
        int numBottles = 9, numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles; 
        int empty = numBottles;
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            sum += newBottles;
            empty = newBottles + (empty % numExchange); 
        }
        return sum;
    }
}
