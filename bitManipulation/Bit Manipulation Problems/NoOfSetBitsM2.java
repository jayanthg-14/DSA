//Brain Keringhans Algorithm
/*
    In this program we Brain Keringhans Algorithm, to zero the last significant bit every time
    By this every time we just does the operation to only setBits(Last Significant Bit)
 */

import java.util.Scanner;

public class NoOfSetBitsM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to check no of set bits:");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0)
        {
            count++;
            num = num & num-1;
            System.out.println(num);
        }
        System.out.println(count);


    }
}
