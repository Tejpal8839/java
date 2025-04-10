import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int n= sc.nextInt();

        System.out.println(n+" in Decimal: "+convertBinaryToDecimal(n));
    }
    public static int convertBinaryToDecimal(int n)
    {
        int pow=0;
        int decimal=0;
        while(n>0)
        {
        int lastDigit=n%10;
        decimal+=lastDigit*Math.pow(2, pow);
        pow++;
        n/=10;
        }
        return decimal;
    }
}
