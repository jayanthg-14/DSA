package secondClass;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3,3,4,4,4};
        int a = 0;
        int b  = 1;
        while(b < arr.length)
        {
            if(arr[b] != arr[a])
            {
                a += 1;
                arr[a] = arr[b];
            }
            b += 1;
        }

        for(int i = 0; i < a+1; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
