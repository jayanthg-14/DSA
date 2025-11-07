public class MaxSubArrSum {

    public static void main(String[] args) {
        int[] arr = {2, -1, 2, 3, -9};
        int maxSum = Integer.MIN_VALUE;
        for(int si = 0; si< arr.length;si++){
            int currSum = 0;
            for(int ei = si; ei<arr.length; ei++){
                currSum += arr[ei];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}