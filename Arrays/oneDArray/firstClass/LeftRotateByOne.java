public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25};
        int fe = arr[0];
        for(int i =1 ; i<=arr.length-1; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = fe;

        for(int i = 0 ; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }   

}
