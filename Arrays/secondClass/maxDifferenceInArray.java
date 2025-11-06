package secondClass;

public class maxDifferenceInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 4, 9};
        int maxDiff = -1;
        int minEle = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < minEle)
            {
                minEle =  arr[i];
            }
            else{
                int diff = arr[i] - minEle;
                if(diff > maxDiff)
                {
                    maxDiff = diff;
                }
            }
        }
        System.out.println(maxDiff);
    }
}
