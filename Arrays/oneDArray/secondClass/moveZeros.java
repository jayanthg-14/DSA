package secondClass;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,0,7,0,3,0};
        int idx = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx += 1;
            }
        }

        for(int i  = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
