//this is the program of the conversion of the hexadecimal to decimal.
import java.util.Scanner;
public class HexadecimalToDecimal {
     public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        String n= sc.nextLine();
        String res=hexadecimalToDecimal(n);
        System.out.println("Hexadecimal is ["+n+"] in deciaml :["+res+"]");
    }
    public static String hexadecimalToDecimal(String n)
    {
        int dec=0;
        int sixteenMul=1;

        for(int i=n.length()-1;i>=0;i--)
        {
            char c=n.charAt(i);
            if(c>=48 && c<=57)
                dec= dec+(c-48)*sixteenMul;
            else if(c>=65 && c<=70)
                  dec=dec+(c-55)*sixteenMul;
            else if(c>=97&& c<=102)
                  dec=dec+(c-87)*sixteenMul;
            else 
                    return "Illegal Input ! Hexadecimal should be 0..F";

            sixteenMul*=16;
        }
        return dec+" ";
    }

}
