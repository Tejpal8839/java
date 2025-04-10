import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printDigit(n);
        
    }
    public static void printDigit(int n)
    {
        while(n>0)
        {
            int rem=n%10;
            System.out.println(rem);
            n/=10;
        }
    }
}
