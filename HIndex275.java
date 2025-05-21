public class HIndex275 {
    public static void main(String[] args) {
        int citations[] = {0,1,3,5,6};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int h = n - mid;
            if (citations[mid] == h) {
                return h;
            } else if (citations[mid] < h) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return n - left;
    }
}
