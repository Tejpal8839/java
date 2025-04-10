
import java.util.Scanner;

public class FactorialOfEachDigitByMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        getDigitFactorial(n);

    }
    public static void getDigitFactorial(int n)
    {
        while(n>0)
        {
            int rem=n%10;
            // int fact= getFactorial(rem);
            System.out.println(rem+"!="+getFactorial(rem));
        n/=10;     
       }

    }
    public static int getFactorial(int n)
    {
        int fact=1;
        int i=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
    
