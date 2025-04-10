
import java.util.Scanner;

public class CheckProductOfDigitEvenOrOdd17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        int prod=1;
        while(n>0)
        {
            int rem=n%10;
            prod=prod*rem;
        n/=10;
        }
        if(prod%2==0)
        System.out.println("It will give Even Product");
        else
        System.out.println("It will give Odd Product");
    }
    
}
