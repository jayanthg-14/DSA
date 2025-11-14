import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{50, 30, 20, 10,40};
                    System.out.println(Arrays.toString(arr));

        int n = arr.length;
        for(int i=0; i<n; i++)
        {   
            int minValInd = i;
            boolean sorted = true;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minValInd]){
                    minValInd = j;
                }

                if(arr[j-1]>arr[j]){
                    sorted = false;
                }
            }
            if (minValInd != i ) {
                int temp = arr[minValInd];
                arr[minValInd] = arr[i];
                arr[i] = temp;
            }
            if(sorted){
                break;
            }

            System.out.println(Arrays.toString(arr));

        }
    }
}
