public class ReachNumber754 {
    public static int reachNumber(int target) {
        target = Math.abs(target); 
        int sum = 0, steps = 0;
        while (sum<target || (sum-target)%2 != 0) {
            steps++;
            sum += steps;
        }
  
        return steps;
    }

    public static void main(String[] args) {
        int target = 3;
        System.out.println(reachNumber(target)); 
    }
}
