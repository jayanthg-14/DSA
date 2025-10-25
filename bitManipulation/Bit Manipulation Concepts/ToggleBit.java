import java.util.*;
public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the position:");
        int pos = sc.nextInt();

        int res = num^(1<<pos-1);
        System.out.println(res);
    }
}
