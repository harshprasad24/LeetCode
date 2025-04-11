public class HighestAltitude1732 {
    public static void main(String[] args) {
        int gain[] = {-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(gain);
        System.out.print(ans);                                      
    }
    public static int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length+1],sum=0;
        altitude[0]=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            altitude[i+1]=sum;
        }
        int highest_altitude = Integer.MIN_VALUE;
        for(int i=0;i<altitude.length;i++){
            if(altitude[i]>highest_altitude){
                highest_altitude=altitude[i];
            }
        }
        return highest_altitude;
    }
}
