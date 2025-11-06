public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            int dup = arr[si];
            arr[si] = arr[ei];
            arr[ei] = dup;

            si++;
            ei--;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
