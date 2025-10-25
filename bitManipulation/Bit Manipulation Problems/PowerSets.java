import java.util.Scanner;

public class PowerSets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to know powersets");
        String str = sc.next();
        char[] arr = str.toCharArray();
        int maxPowerSets =  (int) Math.pow(2, arr.length);

        for(int i = 0; i<8; i++){
            int num = i;
            String set = "";
            int index = arr.length-1;
            for(int j = 0 ; j<arr.length; j++)
            {
                if((num & 1)==1){
                    set = arr[index] +set;

                }
                num = num >> 1;
                index--;
            }
            System.out.println(set);
        }
    }
}
