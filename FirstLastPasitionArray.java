public class FirstLastPasitionArray {
    public static void main(String[] args) {
        int nums[]={1};
        int target = 1;
        int position[] = findFirstLastPosition(nums, target);
        for (int i = 0; i < position.length; i++) {
            System.out.print(position[i]);
        }
    }
    public static int[] findFirstLastPosition(int[] nums, int target) {
        int[] arr = {-1, -1};
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                arr[0] = mid; 
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                arr[1] = mid; 
                start = mid + 1; 
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr;
    }

}
