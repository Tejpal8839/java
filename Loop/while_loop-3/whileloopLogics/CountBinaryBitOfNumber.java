
import java.util.Scanner;

public class CountBinaryBitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        while(n>0)
        {
            count++;
            n/=2;
        }
        System.out.println("Binary count of a Number is "+count);
    }
}
