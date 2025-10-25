public class OddoccuringM3XOR {
    public static void main(String[] args) 
    {
        int[] arr = {5,5,6,7,8,6,8,8,8,8,6,8,7};
        int xor = 0;
        for(int i = 0; i<arr.length; i++){
            xor = xor^arr[i];
        }
        System.out.println(xor);
    }
}
