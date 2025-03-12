public class squareArray977 {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int ans[] = sortedSquares(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        for(int i=0;i<arr.length-1;i++){ // NO OF Turns
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
