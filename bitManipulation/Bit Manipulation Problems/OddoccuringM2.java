/*

    In this program we donot check the matchinvalues for the values
    which are already checked for its paired value

    By updating the checked value with "-1", 
    we can stop iterating innerloop for it.
 */


public class OddoccuringM2 {
    public static void main(String[] args) {
        int[] arr = {5,5,6,7,8,6,8,6,8,8,6,8,7};

        for(int i = 0; i<arr.length; i++)
        {
            
            if(arr[i]!=-1)
            {
                int count = 0;
                int refVal = arr[i];
                // System.out.println("innerLoop");
                for(int j = 0 ; j<arr.length; j++){
                    if(refVal==arr[j]){
                        count++;
                        arr[j]=-1;
                    }
                }
                if(count%2!=0){
                    System.out.println(refVal);
                    break;
                }
            }
        }
    }
}
