import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is Power of 2"); 
        int num = sc.nextInt();
        int count = 0;
        
        while(num != 0){
            int bit = num&1;
            if(bit == 1){
                count++;
            }
            num = num>>1;
        }

        if(count ==1){
            System.out.println("Power of 2");
        }
        else{
            System.err.println("Not a power of 2");
        }
        

    }
}
