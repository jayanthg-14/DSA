import java.util.*;

public class FindSmallestLargest {
    public static void main(String[] args) 
    {
        int[] arr = {19,20, 5, 304, 50 ,47};
        int sm = Integer.MAX_VALUE;
        int lg = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i]<sm){
                sm = arr[i];
            }
            else if(arr[i]>lg){
                lg = arr[i];
            }
        }
        System.out.println(lg+ " "+ sm);
    
    }
}
