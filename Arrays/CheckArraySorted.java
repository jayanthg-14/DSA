public class CheckArraySorted {
    public static void main(String[] args) 
    {
        int[] arr = {1,5,2,3,4,5,6};
        boolean sort = true;
        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                sort = false;
                break;
            }
        }
        System.out.println(sort);
    }
}
