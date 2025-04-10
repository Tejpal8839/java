
import java.util.Scanner;

public class isIncreasingOrderOrNot19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        if(isIncreasingOrder(n))
        System.out.println("Number is in Incresing Order");
        else
        System.out.println("Number is not in Increasing Order");
    
    }
    public static boolean isIncreasingOrder(int n)
    {
        int oldDigit=n%10;
        n/=10;
        while(n>0)
        {
            int newDigit =n%10;

            if(newDigit>oldDigit)
            return false;

            
        n/=10;
        }
        return true;
    }
}
