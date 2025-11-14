import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) 
    {
        int[] arr = new int[]{50, 30, 20, 10,40};
        int n = arr.length;

        for(int j =0 ; j<n-1; j++)
        {   
            boolean sorted = true;
            for(int i=0; i< n-1-j; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    sorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            if (sorted) {
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
        
    }
}