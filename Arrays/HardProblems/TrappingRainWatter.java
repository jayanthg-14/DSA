public class TrappingRainWatter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] leftMax = new int[arr.length];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        int[] rightMax = new int[arr.length];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+ 1], arr[i]);
        }

        int storeWater =0;
        for(int i=1; i<=n-2 ; i++){
            int smallPillar = (int) Math.min(leftMax[i], rightMax[i]);
            int currentWater = smallPillar-arr[i];
            if(currentWater>0){
                storeWater+= currentWater;
            }
        }
        System.out.println(storeWater);


    }
}
