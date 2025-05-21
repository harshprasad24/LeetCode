public class WateringPlants2079 {
    public static void main(String[] args) {
        int plants[] = {3,2,4,2,1}, capacity = 6;
        System.out.print(wateringPlants(plants, capacity));
    }
    public static int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int currentWater = capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=currentWater){
                count++;
                currentWater-=plants[i];
            }else{
                count += i * 2 + 1; 
                currentWater = capacity - plants[i];
            }
        }
        return count;
    }
}
