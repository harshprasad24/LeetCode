public class FourDivisors1390 {
    public static void main(String[] args) {
        int nums[] = {21,21};
        System.out.print(sumFourDivisors(nums));
    }
    public static int sumFourDivisors(int[] nums) {
        int psum = 0;
        for (int num : nums) {
            int count = 0, sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int div1 = i;
                    int div2 = num / i;

                    if (div1 == div2) {
                        count++;
                        sum += div1;
                    } else {
                        count += 2;
                        sum += div1 + div2;
                    }

                    if (count > 4) break; 
                }
            }
            if (count == 4) psum += sum;
        }
        return psum;
    }
}
