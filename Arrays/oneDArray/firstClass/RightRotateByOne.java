public class RightRotateByOne {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25};
        int le = arr[arr.length-1];

        for(int i = arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = le;

        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
