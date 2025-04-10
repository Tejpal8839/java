import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Octal Number: ");
        int n= sc.nextInt();

        System.out.println("Octal["+n+"] in Decimal is: "+OctalToDecimal(n));
    }
    public static String  OctalToDecimal(int n)
    {
        int dec=0;
        int twoMul=1;
        while(n>0)
        {
            int rem=n%10;
            if(rem>7)
            return "Illegal Input Binary number has digits range of 0..1";

            dec+=rem*twoMul;
            twoMul*=8;
            n/=8;
            
        }
        return dec+" ";
        
    }
}

