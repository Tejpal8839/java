
import java.util.Scanner;

public class FactorialOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int fact=1;
        while(n>=0)
        {
            int rem=n%10;
            int i=1;
            while(i<=rem)
            {
                fact=fact*1;
            }
            System.out.println("Factorial of a Digit is: "+ fact);
        n/=10;
        }
    }
}
