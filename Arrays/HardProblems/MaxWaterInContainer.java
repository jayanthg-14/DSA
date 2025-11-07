public class MaxWaterInContainer {
    public static void main(String[] args) {

        int[] arr = {1, 1};
        int maxWater = 0;
        int sp = 0;
        int ep = arr.length-1;
        while(sp<ep){
            int height = (int)(Math.min(arr[sp], arr[ep]));
            int currWeight = height * (ep-sp);
            maxWater = (maxWater<currWeight)?currWeight:maxWater;
            if(arr[sp]<arr[ep]){
                sp++;
            }
            else{
                ep--;
            }
        } 
        System.out.println(maxWater);
    }
}
