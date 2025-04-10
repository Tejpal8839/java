
import java.util.Scanner;



public class AlternateDigit21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        
        System.out.println(isAlternateDigit(n));
    }
    public static boolean isAlternateDigit(int n)
    {
        int oldDigit=n%10;
        n/=10;
        while(n>0)
        {
            int newDigit=n%10;
            if(newDigit==oldDigit)
            return false;

            oldDigit=newDigit;
        n/=10;
        }
        return true;
    }
}
