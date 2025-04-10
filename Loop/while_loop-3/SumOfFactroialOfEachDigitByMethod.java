import java.util.Scanner;

public class SumOfFactroialOfEachDigitByMethod {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int sum = getDigitFactorialSum(n);
        System.out.println("Digit Fact Sum is: "+sum);

    }
    public static int getDigitFactorialSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            //  int fact= getFactorial(rem);
            sum=sum+getFactorial(rem);
           
        n/=10;     
       }
      return sum;
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
