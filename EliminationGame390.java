public class EliminationGame390 {
    public static void main(String[] args) {
        int n= 9;
        System.out.println(lastRemaining(n));
    }

    public static int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        boolean left = true;
        int remaining = n;

        while (remaining > 1) {
            if (left || remaining % 2 == 1) {
                head += step;
            }
            step *= 2;
            remaining /= 2;
            left = !left;  
        }

        return head;
    }
}
