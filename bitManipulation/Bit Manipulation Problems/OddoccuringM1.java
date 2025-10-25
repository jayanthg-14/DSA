/*
    The problem statement of this program to find the unpaired number inside the array
    This is just the basic method, in this we take two nested loops
    and gets each value and counts the matching value in the array
    if the count is odd then it is meant that can not make pairs i.e.
    a single value remains unpaired

 */

public class OddoccuringM1 {
    public static void main(String[] args) 
    {
        int[] arr = {5,5,6,7,8,6,8,6,8,8,6,8,7};

        // System.out.println("innerLoop");
        for(int i=0 ; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count%2 !=0){
                System.out.println("odd occuring is : "+arr[i]);
                break;
            }
        }
    }
}
