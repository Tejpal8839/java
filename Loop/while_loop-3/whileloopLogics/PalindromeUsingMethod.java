import java.util.Scanner;

public class PalindromeUsingMethod {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        if(isPalindrome(n))
        System.out.println(n+" is a Palindrome Number");
        else
        System.out.println(n+" is not a Palindrome Number");
    }
    public static boolean isPalindrome(int n)
    {
        int rev=0,num=n;
        while(n>0)
        {
        int rem=n%10;
        rev=rev*10+rem;
        n/=10;
        }
        return num==rev;
    }
}
