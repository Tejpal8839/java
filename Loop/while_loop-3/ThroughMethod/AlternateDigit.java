import java.util.Scanner;

public class AlternateDigit {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean result= isAlternateDigit(n);
        if(result)
        System.out.println("Alternating digit is Different");
        else
        System.out.println("Alternating digit is same ");
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
            oldDigit = newDigit;
        n/=10;
        }
        return true;
    }
    
}
