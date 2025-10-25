import java.util.Scanner;

public class PowerOf2BrainKeringhans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to check if it is a power of 2:");
        int num = sc.nextInt();

        int count = 0;

        while(num!=0)
        {
            count++;
            num = num & num-1;
        }
        if(count ==1){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
