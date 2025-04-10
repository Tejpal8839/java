
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n= sc.nextInt();
        System.out.println(n+" in Binary is: "+convertDecimalToBinary(n));
    }
    public static String convertDecimalToBinary(int n)
    {
        String bin=" ";
        while(n>0)
        {
            int rem=n%2;
            bin=rem+bin;
            n/=2;
        }
        return bin;
    }
}
