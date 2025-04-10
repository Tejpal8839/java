import java.util.Scanner;

public class BinaryToDecimalMethod2 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int n= sc.nextInt();

        System.out.println("Binary ["+n+"] in Decimal is: "+binaryToDecimal(n));
    }
    public static String  binaryToDecimal(int n)
    {
        int dec=0;
        int twoMul=1;
        while(n>0)
        {
            int rem=n%10;
            if(rem>1)
            return "Illegal Input Binary number has digits range of 0..1";

            dec+=rem*twoMul;
            twoMul*=2;
            n/=10;
            
        }
        return dec+" ";
        
    }
}

