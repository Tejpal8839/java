
import java.util.Scanner;

public class CountTotalDigit7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        while(n>0)
        {
            int rem= n%10;
            count++;
        n/=10;
        }
        System.out.println("Total Count is: "+count);
    }
}
