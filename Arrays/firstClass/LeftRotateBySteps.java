public class LeftRotateBySteps {
    public static void main(String[] args) 
    {
        int[] arr = {10,20,30,40,50,60,70};
        int steps = 2;
        int[] arr2 =new int[7];
        for(int i= 0; i< arr.length; i++){
            if(i<steps)
            {
                arr2[arr2.length-steps+i] = arr[i];                 
            }
            else
            {
                arr2[i-steps] = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr2[i]);
        }

    }
}
