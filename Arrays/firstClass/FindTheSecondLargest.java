public class FindTheSecondLargest {
    public static void main(String[] args) 
    {
        int[] arr = {19,20, 5, 100, 304, 50 ,47};
        int lg = -1;
        int slg = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>lg){
                slg = lg;
                lg = arr[i];
            }
            else if(arr[i]>slg && arr[i]<lg){
                slg = arr[i];
            }
        }

        System.out.println(lg + " " + slg);
    }
}
