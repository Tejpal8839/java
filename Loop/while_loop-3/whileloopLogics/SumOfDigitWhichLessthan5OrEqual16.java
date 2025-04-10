import java.util.Scanner;

public class SumOfDigitWhichLessthan5OrEqual16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem<=5)
            sum+=rem;

            n/=10;
        }
        System.out.println("Sum of Digit which less than 5 is : "+sum);
    }
}
