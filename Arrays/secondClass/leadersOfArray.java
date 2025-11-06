package secondClass;

public class leadersOfArray {
    public static void main(String[] args){
        int[] arr = new int[]{19, 20, 5, 100, 304, 50, 47};
        int curr = arr[arr.length-1];
        System.out.print(curr + " ");
        for(int i = arr.length - 2; i >= 0; i--)
        {
            if(arr[i] > curr)
            {
                System.out.print(arr[i] + " ");
                curr = arr[i];
            }
        }    
    }

}
