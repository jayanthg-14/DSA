/*
    This program finds the no of set bits in the number
    Here we take a number 
    and find the last bits status thorough & operation with bitMask
    and every time we get result 1 we increase count
    and truncate the last bit
 */

import java.util.Scanner;

public class NoOfSetBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check the no of set bits");    
        int num = sc.nextInt();

        int bitMask = 1;
        int count = 0;
        while(num!=0)
        {
            int bit = num & bitMask;
            if(bit == 1){
                count++;
            }
            num = num>>1;
        }
        
        System.out.println(count);
    }
    
}