
import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n= sc.nextInt();
        String res=decimalToHexadecimal(n);
        System.out.println("Decimal is ["+n+"] in Hexadeciaml :["+res+"]");
    }
    public static String decimalToHexadecimal(int n)
    {
        String hex=" ";
        while (n>0) {
            int rem=n%16;
            if(rem<=9)
                hex=rem+hex;
            else
                hex=(char)(rem+55)+hex; 
                // rem+87 which gives lower case value 

                n/=16;
            
            
        }
        return hex;
    }
}
