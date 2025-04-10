
import java.util.Scanner;

 

public class EvenDigitNumber2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        while(n>0)
        {
            int rem=n%10;
            if(rem%2==0)
            {
                System.out.println("Even Digit is: "+rem);
            }
        n/=10;
        }
    }
}
