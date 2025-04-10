import java.util.Scanner;

public class CountEvenDigit10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        while(n>0)
        {
            int rem= n%10;
            if(rem%2==0)
            count++;

        n/=10;
        }
        System.out.println("Total Even Digits in Numbers are : " +count);
    }
}
