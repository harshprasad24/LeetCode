import java.util.Arrays;

public class KClosestPoints973 {
    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        int dist[] = new int[points.length];
        int result[][] = new int[k][2];
        int[][] distWithIndex = new int[points.length][2];
        for (int i = 0; i < points.length; i++) {
            int sum = 0;
            for (int j = 0; j < points[0].length; j++) {
                sum += points[i][j] * points[i][j];
            }
            dist[i] = sum;
            distWithIndex[i][0] = sum;
            distWithIndex[i][1] = i;
        }
        Arrays.sort(distWithIndex, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < k; i++) {
            int idx = distWithIndex[i][1];
            result[i] = points[idx];
        }

        return result;
    }
}
