import java.util.Scanner;

public class PowerOf2BrainKeringhansM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a power of 2:");

        int num = sc.nextInt();

        if((num&num-1) == 0 )
        {
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }    
}
