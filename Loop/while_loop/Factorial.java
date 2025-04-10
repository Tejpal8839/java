// This the Program of the Factorial of the given number 

// System.exit(0) is used to terminate program as well as system. 
import java.util.Scanner;

public class Factorial {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for its factorial: ");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Number Can't be Negative");
            return;
        }
        long fact=1;
        int i=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(n+"!= "+fact);
    }
}
