//write a program to check number is palindrome or not(same concept) .......
import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int reverse=0;
        while(n>0)
        {
            int rem=n%10;
             reverse= reverse*10+rem;

            n/=10;
        }
        System.out.println("Reverse of the Number is : "+reverse);
    }
}
