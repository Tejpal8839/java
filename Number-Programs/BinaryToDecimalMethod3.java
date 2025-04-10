
import java.util.Scanner;

public class BinaryToDecimalMethod3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // String s1="3ohan";
        // System.out.println(s1.charAt(0));
        // System.out.println(s1.charAt(2));
        // System.out.println((s1.charAt(0)-48)*4);
        System.out.println("Enter the Binary Number: ");
        String s1= sc.nextLine();
        String decimal=binaryToDecimal(n);
        System.out.println("Binary ["+n+"] in Decimal is:["+decimal+"]");
       
    }
    publlic static String binaryToDeciaml(String s1)
    {
        int dec=0,twoMul=1;
        for (int i = s1.length()-1; i>=1; i--){
            char c= sc.charAt(i);
            if(c!=0 && c!=1)
            return "Illegal Input ";


            dec=dec+(c-48)*twoMul;
            twoMul*=2;
        }
        return dec+" ";
    }
}
