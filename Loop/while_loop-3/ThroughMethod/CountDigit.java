
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=getDigitCount(n);
        System.out.println("Total Digit is: "+count);

    }
    public static int  getDigitCount(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;

            n/=10;
        }
        
        return count;
    }
}
