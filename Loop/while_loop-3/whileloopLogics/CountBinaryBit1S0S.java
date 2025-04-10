import java.util.Scanner;

public class CountBinaryBit1S0S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        int c=0;
        while(n>0)
        {
            //int rem=n%2;
            if(n%2==1)
            count++;

            if(n%2==0)
            c++;

            n/=2;
        }
        System.out.println("Binary count 1's in a Number is "+count);
        System.out.println("Binary count 0's in a Number is "+c);
}
}
