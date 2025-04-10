import java.util.Scanner;

public class DecimalToOctal {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n= sc.nextInt();
        String octal=DecimalToOctal(n);
        System.out.println(n+" in Binary is:["+octal+"]");
    }
    public static String DecimalToOctal(int n)
    {
        String oct=" ";
        while(n>0)
        {
            int rem=n%8;
            oct=rem+oct;
            n/=8;
        }
        return oct;
    }
}
