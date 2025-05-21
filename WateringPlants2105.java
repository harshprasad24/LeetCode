public class WateringPlants2105 {
    public static void main(String[] args) {
        int plants[] = {3,2,4,2,1}, capacityA = 5, capacityB = 5;
        System.out.print(minimumRefill(plants, capacityA, capacityB));
    }
    public static int minimumRefill(int[] plants, int capacityA, int capacityB){
        int count=0;
        int restoreA=capacityA,restoreB=capacityB;
        for(int i=0;i<plants.length;i++){
            int j = plants.length - 1 - i;
            if (i > j) break;
            if (i == j) {
                if (Math.max(restoreA, restoreB) < plants[i]) {
                    count++;
                }
                break;
            }
        
            if (plants[i] <= restoreA) {
                restoreA -= plants[i];
            }else {
                count++;
                restoreA = capacityA - plants[i];
            }
            if (plants[j] <= restoreB) {
                restoreB -= plants[j];
            }else {
                count++;
                restoreB = capacityB - plants[j];
            }
        }
        
        return count;
    }
}
